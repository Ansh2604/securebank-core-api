package com.securebank.compliance;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "compliance_holds")
public class ComplianceHold {

    @Id
    @Column(length = 36)
    private String id;

    @Column(name = "account_id", nullable = false, length = 36)
    private String accountId;

    @Column(nullable = false, length = 500)
    private String reason;

    @Column(nullable = false)
    private long amount;

    @Column(nullable = false, length = 20)
    private String status;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    protected ComplianceHold() {}

    public ComplianceHold(String id, String accountId, String reason, long amount,
                          String status, Instant createdAt) {
        this.id = id;
        this.accountId = accountId;
        this.reason = reason;
        this.amount = amount;
        this.status = status;
        this.createdAt = createdAt;
    }

    public String getId() { return id; }

    public String getAccountId() { return accountId; }

    public String getReason() { return reason; }

    public long getAmount() { return amount; }

    public String getStatus() { return status; }

    public Instant getCreatedAt() { return createdAt; }
}
