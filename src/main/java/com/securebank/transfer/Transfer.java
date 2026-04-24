package com.securebank.transfer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "transfers")
public class Transfer {

    @Id
    @Column(length = 36)
    private String id;

    @Column(name = "source_account_id", nullable = false, length = 36)
    private String sourceAccountId;

    @Column(name = "target_account_id", nullable = false, length = 36)
    private String targetAccountId;

    @Column(nullable = false)
    private long amount;

    @Column(nullable = false, length = 3)
    private String currency;

    @Column(nullable = false, length = 20)
    private String status;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    protected Transfer() {}

    public Transfer(String id, String sourceAccountId, String targetAccountId, long amount,
                    String currency, String status, Instant createdAt) {
        this.id = id;
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.amount = amount;
        this.currency = currency;
        this.status = status;
        this.createdAt = createdAt;
    }

    public String getId() { return id; }

    public String getSourceAccountId() { return sourceAccountId; }

    public String getTargetAccountId() { return targetAccountId; }

    public long getAmount() { return amount; }

    public String getCurrency() { return currency; }

    public String getStatus() { return status; }

    public Instant getCreatedAt() { return createdAt; }
}
