package com.gerenciadordeprodutos.api.repository

import com.gerenciadordeprodutos.api.model.Estoque
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EstoqueRepository : JpaRepository<Estoque, Long> {
}