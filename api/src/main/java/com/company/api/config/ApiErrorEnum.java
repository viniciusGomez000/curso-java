package com.company.api.config;

public enum ApiErrorEnum {

    RECORD_NOT_FOUND_MESSAGE("Registro não encontrado");

    private String descricao;

    ApiErrorEnum(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
}
