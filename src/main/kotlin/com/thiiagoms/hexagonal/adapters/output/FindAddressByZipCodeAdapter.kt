package com.thiiagoms.hexagonal.adapters.output

import com.thiiagoms.hexagonal.adapters.output.client.FindAddressByZipCodeClient
import com.thiiagoms.hexagonal.application.core.domain.Address
import com.thiiagoms.hexagonal.application.ports.output.FindAddressByZipcodeOutputPort
import org.springframework.stereotype.Component

@Component
class FindAddressByZipCodeAdapter(
    private val findAddressByZipCodeClient: FindAddressByZipCodeClient
) : FindAddressByZipcodeOutputPort {

    override fun find(zipcode: String): Address = findAddressByZipCodeClient
        .find(zipcode = zipcode)
        .toAddressDomain()
}