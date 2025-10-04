package com.thiiagoms.hexagonal.application.ports.output

import com.thiiagoms.hexagonal.application.core.domain.Address

interface FindAddressByZipcodeOutputPort {
    fun find(zipcode: String): Address
}