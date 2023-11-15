package com.gerenciadordeprodutos.api.repository

import com.gerenciadordeprodutos.api.model.Fornecedor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FornecedorRepository : JpaRepository<Fornecedor, Long> {
}