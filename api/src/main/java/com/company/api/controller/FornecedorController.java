package com.company.api.controller;

import com.company.api.domain.Fornecedor;
import com.company.api.service.FornecedorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class FornecedorController {

    FornecedorService fornecedorService;
    public FornecedorController(FornecedorService fornecedorService) {
        this.fornecedorService = fornecedorService;
    }

    @PostMapping("/fornecedores")
    public Fornecedor save(@RequestBody Fornecedor fornecedor) {
        return fornecedorService.save(fornecedor);
    }
}
