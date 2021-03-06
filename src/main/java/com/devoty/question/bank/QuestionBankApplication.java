package com.devoty.question.bank;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.devoty.question.bank.mapper")
public class QuestionBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionBankApplication.class, args);
	}

}
