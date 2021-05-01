package com.company.api.service;

import com.company.api.domain.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    public Cliente one(Integer id){
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("Teste");
        return cliente;
    }

    public Cliente save(Cliente cliente){
        return cliente;
    }
}
