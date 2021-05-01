package com.company.api.controller;

import com.company.api.domain.Cliente;
import com.company.api.service.ClienteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ClienteController {

    ClienteService clienteService;
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/clientes/{id}")
    public Cliente one(@PathVariable Integer id){
        return clienteService.one(id);
    }

    @PostMapping("/clientes")
    public Cliente save(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }
}
