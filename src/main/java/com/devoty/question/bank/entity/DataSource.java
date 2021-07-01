package com.devoty.question.bank.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("data_source")
public class DataSource {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String url;
    private String data;

}
