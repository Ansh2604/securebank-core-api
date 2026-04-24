package com.securebank.transaction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @Column(length = 36)
    private String id;

    @Column(name = "account_id", nullable = false, length = 36)
    private String accountId;

    @Column(nullable = false, length = 20)
    private String type;

    @Column(nullable = false)
    private long amount;

    @Column(nullable = false, length = 3)
    private String currency;

    @Column(length = 500)
    private String description;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    protected Transaction() {}

    public Transaction(String id, String accountId, String type, long amount, String currency,
                       String description, Instant createdAt) {
        this.id = id;
        this.accountId = accountId;
        this.type = type;
        this.amount = amount;
        this.currency = currency;
        this.description = description;
        this.createdAt = createdAt;
    }

    public String getId() { return id; }

    public String getAccountId() { return accountId; }

    public String getType() { return type; }

    public long getAmount() { return amount; }

    public String getCurrency() { return currency; }

    public String getDescription() { return description; }

    public Instant getCreatedAt() { return createdAt; }
}
