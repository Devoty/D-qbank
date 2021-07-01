package com.devoty.question.bank.constants;

import java.io.Serializable;

import lombok.Data;

@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -7557258753883492883L;

    /** 状态码 */
    private String code;

    /** 提示信息 */
    private String msg;

    private Boolean success;

    /** 返回数据 */
    private T data;

    @Override
    public String toString() {
        return "Result{" + "code=" + code + ", msg='" + msg + '\'' + ", data=" + data + '}';
    }
}