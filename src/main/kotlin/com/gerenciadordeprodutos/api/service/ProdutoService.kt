package com.gerenciadordeprodutos.api.service

import com.gerenciadordeprodutos.api.model.Produto
import com.gerenciadordeprodutos.api.repository.ProdutoRepository
import org.springframework.stereotype.Service

@Service
class ProdutoService(
    private val repository: ProdutoRepository
) {
    fun create(produto: Produto){
        repository.save(produto)
    }
}