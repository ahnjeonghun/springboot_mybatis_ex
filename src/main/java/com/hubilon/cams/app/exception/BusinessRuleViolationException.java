package com.hubilon.cams.app.exception;

public class BusinessRuleViolationException extends RuntimeException {
    public BusinessRuleViolationException(String message){
        super(message);
    }
}
