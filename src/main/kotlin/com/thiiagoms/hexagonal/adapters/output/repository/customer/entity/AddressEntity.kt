package com.thiiagoms.hexagonal.adapters.output.repository.customer.entity

import com.thiiagoms.hexagonal.application.core.domain.Address

data class AddressEntity(
    val street: String,
    val city: String,
    val state: String
) {
    constructor(address: Address): this(
        city = address.city,
        state = address.state,
        street = address.street,
    )
}
