package com.company.api.service;

import com.company.api.config.ApiErrorEnum;
import com.company.api.domain.Fornecedor;
import com.company.api.repository.FornecedorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

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
        Optional<Fornecedor> possivelFornecedor = fornecedorRepository.findById(id);
        if(!possivelFornecedor.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    ApiErrorEnum.RECORD_NOT_FOUND_MESSAGE.getDescricao());
        }
        fornecedorRepository.deleteById(id);
    }

    public List<Fornecedor> findAll() {
        return fornecedorRepository.findAll();
    }
}