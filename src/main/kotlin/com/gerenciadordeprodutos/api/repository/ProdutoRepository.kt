package com.gerenciadordeprodutos.api.repository

import com.gerenciadordeprodutos.api.model.Produto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProdutoRepository : JpaRepository<Produto, Long> {
    fun findByCodigoDeBarras(codigoDeBarras : Long) : Produto?
}