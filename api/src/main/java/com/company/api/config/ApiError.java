package com.company.api.config;

import java.util.Arrays;
import java.util.List;

public class ApiError {
    private List<String> errors;

    public ApiError(List<String> erros){
        this.errors = erros;
    }

    public ApiError(String message){
        this.errors = Arrays.asList(message);
    }

    public List<String> getErrors() {
        return errors;
    }
}
