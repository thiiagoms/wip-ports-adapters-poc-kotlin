package com.thiiagoms.hexagonal.adapters.input.controller.request

import jakarta.validation.constraints.NotBlank

data class CustomerRequest(
    @field:NotBlank(message = "Name must not be blank")
    val name: String,
    @field:NotBlank(message = "Email must not be blank")
    val email: String,
    @field:NotBlank(message = "CPF must not be blank")
    val cpf: String,
    @field:NotBlank(message = "Street must not be blank")
    val zipcode: String
) {
}
