package com.thiiagoms.hexagonal.adapters.output.repository.customer.entity

import com.thiiagoms.hexagonal.application.core.domain.Customer
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.MongoId

@Document(collection = "customers")
data class CustomerEntity(
    @MongoId
    val id: String?,
    val name: String,
    val email: String,
    val address: AddressEntity,
    val cpf: String,
    val isValidCpf: Boolean
) {
    constructor(customer: Customer): this(
        id = customer.id,
        cpf = customer.cpf,
        name = customer.name,
        email = customer.email,
        address = AddressEntity(address = customer.address!!),
        isValidCpf = customer.isValidCpf
    )
}
