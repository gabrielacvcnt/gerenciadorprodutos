package com.gerenciadordeprodutos.api.controller

import com.gerenciadordeprodutos.api.model.Produto
import com.gerenciadordeprodutos.api.service.ProdutoService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/produto")
class ProdutoController(
    private val service: ProdutoService
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody produto: Produto){
        service.create(produto)
    }
}