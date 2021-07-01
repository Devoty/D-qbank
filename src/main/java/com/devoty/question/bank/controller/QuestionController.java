package com.devoty.question.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qbank/question")
public class QuestionController {

    @GetMapping("test")
    public String test(){
        return "Q-Bank";
    }

}
