package com.thiiagoms.hexagonal.application.ports.input

import com.thiiagoms.hexagonal.application.core.domain.Customer

interface InsertCustomerInputPort {
    fun save(customer: Customer, zipcode: String)
}
