package com.thiiagoms.hexagonal.adapters.output.client

import com.thiiagoms.hexagonal.adapters.output.client.response.AddressResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "FindAddressByZipCodeClient", url = "\${thiiagoms.client.address.url}")
interface FindAddressByZipCodeClient {

    @GetMapping("/{zipcode}")
    fun find(@PathVariable zipcode: String): AddressResponse
}