package com.company.api.service;

import com.company.api.domain.Fornecedor;
import com.company.api.repository.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    private FornecedorRepository fornecedorRepository;

    public FornecedorService(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    public Fornecedor one(Integer id) {
        return fornecedorRepository.findById(id).get();
    }

    public Fornecedor save(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public Fornecedor uptade(Integer id, Fornecedor fornecedor) { fornecedor.setId(id); return fornecedorRepository.save(fornecedor); }

    public void delete(Integer id) {
        fornecedorRepository.deleteById(id);
    }

    public List<Fornecedor> findAll() {
        return fornecedorRepository.findAll();
    }
}