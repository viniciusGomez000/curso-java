package com.company.api.controller;

import com.company.api.domain.Fornecedor;
import com.company.api.service.FornecedorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    FornecedorService fornecedorService;
    public FornecedorController(FornecedorService fornecedorService) {
        this.fornecedorService = fornecedorService;
    }

    @PostMapping()
    public Fornecedor save(@RequestBody Fornecedor fornecedor) {
        return fornecedorService.save(fornecedor);
    }

    @GetMapping
    public List<Fornecedor> findAll(){
        return fornecedorService.findAll();
    }

    @PutMapping("/{id}")
    public Fornecedor uptade(@PathVariable Integer id, @RequestBody Fornecedor fornecedor) {
        return fornecedorService.uptade(id, fornecedor);
    }

    @GetMapping("/{id}")
    public Fornecedor one(@PathVariable Integer id){
        return fornecedorService.one(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        fornecedorService.delete(id);

    }
}
