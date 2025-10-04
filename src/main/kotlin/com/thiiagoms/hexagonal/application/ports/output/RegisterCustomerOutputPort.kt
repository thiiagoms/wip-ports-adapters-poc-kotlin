package com.thiiagoms.hexagonal.application.ports.output

import com.thiiagoms.hexagonal.application.core.domain.Customer

interface RegisterCustomerOutputPort {
    fun save(customer: Customer)
}