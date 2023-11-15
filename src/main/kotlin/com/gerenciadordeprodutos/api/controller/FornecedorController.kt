package com.gerenciadordeprodutos.api.controller

import com.gerenciadordeprodutos.api.model.Fornecedor
import com.gerenciadordeprodutos.api.service.FornecedorService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/fornecedor")
class FornecedorController(
    private val service: FornecedorService
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody fornecedor: Fornecedor){
        service.create(fornecedor)
    }
}