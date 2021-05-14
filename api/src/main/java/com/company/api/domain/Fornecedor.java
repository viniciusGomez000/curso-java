package com.company.api.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    public void setNome(String  nome){this.nome = nome; }
    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }
    public Integer getId() { return id; }

}