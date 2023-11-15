package com.gerenciadordeprodutos.api.service

import com.gerenciadordeprodutos.api.model.Produto
import com.gerenciadordeprodutos.api.repository.EstoqueRepository
import com.gerenciadordeprodutos.api.repository.ProdutoRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class VendaService(
    private val estoqueRepository: EstoqueRepository,
    private val produtoRepository: ProdutoRepository,
) {
    fun consultarCodigoDeBarras(codigoDeBarras: Long) : Produto {
        return produtoRepository.findByCodigoDeBarras(codigoDeBarras) ?: throw ResponseStatusException(
            HttpStatus.NOT_FOUND,
            "Produto não encontrado com o código de barras informado."
        )
    }
}