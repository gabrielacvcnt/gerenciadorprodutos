package com.gerenciadordeprodutos.api.service

import com.gerenciadordeprodutos.api.model.Cliente
import com.gerenciadordeprodutos.api.repository.ClienteRepository
import org.springframework.stereotype.Service

@Service
class ClienteService (
    private val repository: ClienteRepository
){
    fun create(cliente: Cliente){
        repository.save(cliente)
    }
}