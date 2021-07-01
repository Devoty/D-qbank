package com.devoty.question.bank.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("chapter")
public class Chatper {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String chapterId;
    private String qBankId;
    private String title;
}
