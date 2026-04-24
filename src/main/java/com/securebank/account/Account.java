package com.securebank.account;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @Column(length = 36)
    private String id;

    @Column(name = "customer_id", nullable = false, length = 36)
    private String customerId;

    @Column(nullable = false, length = 20)
    private String type;

    @Column(nullable = false)
    private long balance;

    @Column(nullable = false, length = 3)
    private String currency;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    protected Account() {}

    public Account(String id, String customerId, String type, long balance, String currency, Instant createdAt) {
        this.id = id;
        this.customerId = customerId;
        this.type = type;
        this.balance = balance;
        this.currency = currency;
        this.createdAt = createdAt;
    }

    public String getId() { return id; }

    public String getCustomerId() { return customerId; }

    public String getType() { return type; }

    public long getBalance() { return balance; }

    public String getCurrency() { return currency; }

    public Instant getCreatedAt() { return createdAt; }
}
