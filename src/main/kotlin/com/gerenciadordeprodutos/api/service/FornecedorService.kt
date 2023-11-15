package com.gerenciadordeprodutos.api.service

import com.gerenciadordeprodutos.api.model.Fornecedor
import com.gerenciadordeprodutos.api.repository.FornecedorRepository
import org.springframework.stereotype.Service

@Service
class FornecedorService(
    private val repository: FornecedorRepository
) {
    fun create(fornecedor: Fornecedor){
        repository.save(fornecedor)
    }
}