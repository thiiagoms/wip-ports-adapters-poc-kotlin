package com.thiiagoms.hexagonal.application.core.domain

data class Address(
    val street: String,
    val number: String? = null,
    val complement: String? = null,
    val city: String,
    val state: String,
    val zipCode: String? = null
)
