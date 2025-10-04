package com.thiiagoms.hexagonal.adapters.output.client.response

import com.thiiagoms.hexagonal.application.core.domain.Address

data class AddressResponse(
    val street: String,
    val city: String,
    val state: String,
) {
    fun toAddressDomain() = Address(street = street, city = city, state = state)
}
