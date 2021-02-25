package com.example.oauth2.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class SelfExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Object handler(Exception e) {
        return e.getMessage();
    }
}
