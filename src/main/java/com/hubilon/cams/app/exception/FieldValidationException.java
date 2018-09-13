package com.hubilon.cams.app.exception;

public class FieldValidationException extends IllegalArgumentException {
    public FieldValidationException(String message){
        super(message);
    }
}
