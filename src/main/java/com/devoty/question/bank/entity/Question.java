package com.devoty.question.bank.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("question")
public class Question {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String questionId;
    private String type;
    private String stem;
    private String answer;
    private String analysis;
    private String options;
    private String difficulty;
    private String qBankId;
    private String chapterId;
}
