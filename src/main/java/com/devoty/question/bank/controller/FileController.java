package com.devoty.question.bank.controller;

import com.devoty.question.bank.constants.Result;
import com.devoty.question.bank.service.FileService;
import com.devoty.question.bank.util.ResultUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("file")
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping("/upload")
    public Result<String> upload(@RequestParam(name = "file", required = false) MultipartFile file) {
        return ResultUtil.success(fileService.uploadFile(file));
    }

}
