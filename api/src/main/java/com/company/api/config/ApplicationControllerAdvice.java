package com.company.api.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class ApplicationControllerAdvice {

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity response(ResponseStatusException ex){
        String errorMessage = ex.getReason();
        HttpStatus statusCode = ex.getStatus();
        ApiError apiErrors = new ApiError(errorMessage);
        return new ResponseEntity(apiErrors, statusCode);
    }
}
