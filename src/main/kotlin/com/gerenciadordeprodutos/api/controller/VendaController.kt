package com.gerenciadordeprodutos.api.controller

import com.gerenciadordeprodutos.api.model.Produto
import com.gerenciadordeprodutos.api.service.VendaService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/venda")
class VendaController (
    private val service: VendaService
) {
    @GetMapping("/consultar-cod-barras/{codigoDeBarras}")
    @ResponseStatus(HttpStatus.OK)

    fun consultarCodigoDeBarras(@PathVariable codigoDeBarras: Long) : Produto {
        return service.consultarCodigoDeBarras(codigoDeBarras)
    }
}