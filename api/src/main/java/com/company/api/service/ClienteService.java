package com.company.api.service;

import com.company.api.domain.Cliente;
import com.company.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente one(Integer id){
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("Teste");
        return cliente;
    }

    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
