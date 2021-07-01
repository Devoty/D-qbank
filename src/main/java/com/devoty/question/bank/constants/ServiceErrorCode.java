package com.devoty.question.bank.constants;


public enum ServiceErrorCode implements IErrorCode {
    /** 成功 */
    REQUEST_SUCCESS("200100", "成功"),

    /** 失败 */
    REQUEST_FAILED("200101", "失败"),

    TOKEN_ERROR("200102", "Token已过期"),

    UNKNOWN_USER_ERROR("200401","用户名或密码错误"),
    FILE_UPLOAD_ERROR("200301", "文件上传错误"),

    /**未知错误 */
    UNKNOWN_ERROR("200500", "未知错误");

    /** 状态 */
    private String code;
    /** 含义 */
    private String message;

    ServiceErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}