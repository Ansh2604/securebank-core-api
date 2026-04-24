# ADR 0003: Money Stored as long cents

Date: 2026-01-05
Status: Accepted

## Context
Options: double, BigDecimal, long cents.

## Decision
All monetary amounts stored as `long` representing cents.
DTO fields named `amountCents`.

## Rationale
- double: 0.1 + 0.2 ≠ 0.3 — unacceptable for money
- BigDecimal: correct but adds ceremony
- long cents: exact, fast, simple

## Consequences
- Never use `amount` — always `amountCents`
- Never DECIMAL/NUMERIC columns — always BIGINT