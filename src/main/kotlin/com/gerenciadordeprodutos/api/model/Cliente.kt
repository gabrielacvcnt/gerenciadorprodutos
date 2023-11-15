package com.gerenciadordeprodutos.api.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor

@AllArgsConstructor
@NoArgsConstructor
@Entity
data class Cliente(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    val id: Long? = null,
    val nomeCompleto: String? = null,
    val cpfCnpj: String? = null,
    val email: String? = null,
    val enderecoCompleto: String? = null
)