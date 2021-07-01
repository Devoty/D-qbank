package com.devoty.question.bank.util;

import com.devoty.question.bank.config.MinioConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.minio.MinioClient;

@Configuration
public class MinioConfiguration {

    private MinioConfig minioConfig;

    public MinioConfiguration(MinioConfig minioConfig) {
        this.minioConfig = minioConfig;
    }

    @Bean
    public MinioClient gMinioClient(){
        MinioClient minioClient = MinioClient.builder()
                                            .endpoint(minioConfig.getEndpoint())
                                            .credentials(minioConfig.getAccessKey(), minioConfig.getSecretKey())
                                            .build();
        return minioClient;
    }




}
