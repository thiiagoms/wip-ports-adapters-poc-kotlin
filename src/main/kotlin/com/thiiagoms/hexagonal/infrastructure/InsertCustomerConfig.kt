package com.thiiagoms.hexagonal.infrastructure

import com.thiiagoms.hexagonal.adapters.output.FindAddressByZipCodeAdapter
import com.thiiagoms.hexagonal.adapters.output.RegisterCustomerAdapter
import com.thiiagoms.hexagonal.application.core.domain.Address
import com.thiiagoms.hexagonal.application.core.usecases.customer.register.RegisterCustomer
import com.thiiagoms.hexagonal.application.ports.input.InsertCustomerInputPort
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InsertCustomerConfig {

    @Bean
    fun insertCustomer(
        findAddressByZipCode: FindAddressByZipCodeAdapter,
        registerCustomer: RegisterCustomerAdapter
    ) : InsertCustomerInputPort = RegisterCustomer(
        findAddressByZipcode = findAddressByZipCode,
        registerCustomer = registerCustomer
    )
}
