package com.devoty.question.bank.service.impl;

import java.io.InputStream;
import java.util.UUID;

import com.devoty.question.bank.config.MinioConfig;
import com.devoty.question.bank.constants.ServiceErrorCode;
import com.devoty.question.bank.exception.ServiceException;
import com.devoty.question.bank.service.FileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import io.minio.MinioClient;
import io.minio.PutObjectArgs;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private MinioClient minioClient;

    @Autowired
    private MinioConfig minioConfig;


    @Override
    public String uploadFile(MultipartFile multipartFile) {
        String orgfileName = multipartFile.getOriginalFilename();
        String subfix = orgfileName.substring(orgfileName.lastIndexOf("."));
        String uuid = UUID.randomUUID().toString();
        String objectName = uuid+ subfix;
        try {
            InputStream inputStream = multipartFile.getInputStream();

            PutObjectArgs putObjectArgs = PutObjectArgs.builder().bucket(
                    minioConfig.getBucket()).object(objectName)
                    .stream(inputStream, -1, 10485760).build();

            minioClient.putObject(putObjectArgs);
            inputStream.close();

        } catch (Exception e) {
            throw new ServiceException(ServiceErrorCode.FILE_UPLOAD_ERROR);
        }

        return objectName;
    }

}


