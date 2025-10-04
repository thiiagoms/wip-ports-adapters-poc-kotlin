package com.thiiagoms.hexagonal.adapters.input.controller

import com.thiiagoms.hexagonal.adapters.input.controller.request.CustomerRequest
import com.thiiagoms.hexagonal.application.core.domain.Customer
import com.thiiagoms.hexagonal.application.ports.input.InsertCustomerInputPort
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/api/v1/customers"])
class CustomerController (private val saveCustomer: InsertCustomerInputPort){

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    fun save(@Valid @RequestBody request: CustomerRequest) {
        with(receiver = request) {
            val customer = Customer(name = name, email = email, cpf = cpf)
            saveCustomer.save(customer = customer, zipcode = zipcode)
        }
    }
}