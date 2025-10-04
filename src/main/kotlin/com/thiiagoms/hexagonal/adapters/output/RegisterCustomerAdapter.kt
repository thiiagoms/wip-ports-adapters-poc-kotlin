package com.thiiagoms.hexagonal.adapters.output

import com.thiiagoms.hexagonal.application.core.domain.Customer
import com.thiiagoms.hexagonal.application.ports.output.RegisterCustomerOutputPort
import org.springframework.stereotype.Component

@Component
class RegisterCustomerAdapter: RegisterCustomerOutputPort {
    override fun save(customer: Customer) {

    }
}