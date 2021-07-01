package com.devoty.question.bank.vo;

import lombok.Data;

@Data
public class HttpClientResult {
    /**
     * 响应状态码
     */
    private int code;

    /**
     * 响应数据
     */
    private String content;

    private String url;



    public HttpClientResult(int code) {
        this.code = code;
    }

    public HttpClientResult(int code, String content, String url) {
        this.code = code;
        this.content = content;
        this.url = url;
    }
}
