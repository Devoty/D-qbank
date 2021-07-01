package com.devoty.question.bank.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import lombok.Data;

@Data
public class Volume {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String volumeId;
    private String volumeTitle;

}