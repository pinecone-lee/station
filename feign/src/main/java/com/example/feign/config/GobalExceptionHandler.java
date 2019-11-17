package com.example.feign.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public String handler(){
        return "blank";
    }
}
