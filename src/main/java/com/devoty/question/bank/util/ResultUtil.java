package com.devoty.question.bank.util;

import com.devoty.question.bank.constants.IErrorCode;
import com.devoty.question.bank.constants.Result;
import com.devoty.question.bank.constants.ServiceErrorCode;

public class ResultUtil<T> {

    /**
     * 处理请求成功,返回数据
     *
     * @param o 具体数据
     * @return 返回统一响应结果
     */
    public static <T> Result<T> success(T o) {
        Result<T> girlResult = new Result<>();
        girlResult.setCode(ServiceErrorCode.REQUEST_SUCCESS.getCode());
        girlResult.setMsg(ServiceErrorCode.REQUEST_SUCCESS.getMessage());
        girlResult.setSuccess(true);
        girlResult.setData(o);
        return girlResult;
    }

    /**
     * 处理请求成功，无数据返回
     *
     * @return 返回统一响应结果
     */
    public static <T> Result<T> success() {
        return success(null);
    }

    /**
     * 失败请求
     *
     * @return 返回统一响应结果
     */
    public static <T> Result<T> error(String code, String msg) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(null);
        result.setSuccess(false);
        return result;
    }

    /**
     * 失败请求
     *
     * @return 返回统一响应结果
     */
    public static <T> Result<T> error(IErrorCode resultEnum) {
        Result<T> objectResult = new Result<>();
        objectResult.setCode(resultEnum.getCode());
        objectResult.setMsg(resultEnum.getMessage());
        objectResult.setData(null);
        return objectResult;
    }

}