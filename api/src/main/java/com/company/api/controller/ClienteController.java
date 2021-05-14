package com.company.api.controller;

import com.company.api.domain.Cliente;
import com.company.api.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    ClienteService clienteService;
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public Cliente save(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @GetMapping
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }

    @PutMapping("/{id}")
    public Cliente update(@PathVariable Integer id, @RequestBody Cliente cliente) {
        return clienteService.update(id, cliente);
    }

    @GetMapping("/{id}")
    public Cliente one(@PathVariable Integer id){
        return clienteService.one(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        clienteService.delete(id);
    }

}
