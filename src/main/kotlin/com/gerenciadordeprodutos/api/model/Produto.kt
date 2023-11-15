package com.gerenciadordeprodutos.api.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
import java.math.BigDecimal
import java.util.Date

@AllArgsConstructor
@NoArgsConstructor
@Entity
data class Produto(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nome: String? = null,
    val descricao: String? = null,
    val valor: BigDecimal? = null,
    val CodigoDeBarras: Long? = null,
    val dataFabricacao: Date? = null,
    val dataValidade: Date? = null,

    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    val fornecedor: Fornecedor? = null,
)
