package com.devoty.question.bank.controller;

import com.devoty.question.bank.service.DataSourceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataSourceController {

    @Autowired
    @Qualifier("sourceService")
    private DataSourceService dataSourceService;

    @GetMapping("obtainQuestion")
    public void obtainQuestion(){
        dataSourceService.obtainQuestion();
    }

}
