package com.thiiagoms.hexagonal.application.core.usecases.customer.register

import com.thiiagoms.hexagonal.application.core.domain.Customer
import com.thiiagoms.hexagonal.application.ports.input.InsertCustomerInputPort
import com.thiiagoms.hexagonal.application.ports.output.FindAddressByZipcodeOutputPort
import com.thiiagoms.hexagonal.application.ports.output.RegisterCustomerOutputPort

class RegisterCustomer(
    private val findAddressByZipcode: FindAddressByZipcodeOutputPort,
    private val registerCustomer: RegisterCustomerOutputPort
) : InsertCustomerInputPort {
    override fun save(customer: Customer, zipcode: String) {
        customer.apply {
            address = findAddressByZipcode.find(zipcode = zipcode)
        }.let {
            registerCustomer.save(customer = it)
        }
    }
}
