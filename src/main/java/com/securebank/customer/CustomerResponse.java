package com.securebank.customer;

import java.time.Instant;

public record CustomerResponse(Long id, String name, String email, Instant createdAt) {

    public static CustomerResponse from(Customer customer) {
        return new CustomerResponse(
                customer.getId(),
                customer.getName(),
                customer.getEmail(),
                customer.getCreatedAt()
        );
    }
}
