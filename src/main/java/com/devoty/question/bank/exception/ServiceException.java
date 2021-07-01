package com.devoty.question.bank.exception;

import com.devoty.question.bank.constants.IErrorCode;

public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = -1260775338752265332L;


    private IErrorCode resultEnum;

    private String code;

    public ServiceException(IErrorCode resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
        this.resultEnum = resultEnum;
    }

    public IErrorCode getErrorEnum(){
        return this.resultEnum;
    }

	public String getCode() {
		return this.code;
	}



}