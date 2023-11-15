package com.gerenciadordeprodutos.api.repository

import com.gerenciadordeprodutos.api.model.Cliente
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClienteRepository : JpaRepository<Cliente, Long> {
}