package com.company.api.domain;

public class Cliente {
    private Integer id;

    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public Integer getId(){
        return id;
    }
}
