package com.company.api.service;

import com.company.api.config.ApiErrorEnum;
import com.company.api.domain.Cliente;
import com.company.api.repository.ClienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public Cliente one(Integer id){
        return clienteRepository.findById(id).get();
    }

    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente update(Integer id, Cliente cliente) { cliente.setId(id); return clienteRepository.save(cliente); }

    public void delete(Integer id) {
        Optional<Cliente> possivelCliente = clienteRepository.findById(id);
        if(!possivelCliente.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    ApiErrorEnum.RECORD_NOT_FOUND_MESSAGE.getDescricao());
        }
        clienteRepository.deleteById(id);
    }
}
