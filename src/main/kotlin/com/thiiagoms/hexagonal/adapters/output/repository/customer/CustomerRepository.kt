package com.thiiagoms.hexagonal.adapters.output.repository.customer

import com.thiiagoms.hexagonal.adapters.output.repository.customer.entity.CustomerEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : MongoRepository<CustomerEntity, String>