# SecureBank Architecture Overview

## System Shape
Hexagonal (Ports & Adapters) with package-by-feature.
Each feature owns: domain/, application/, infrastructure/, api/.

## Services
- core-api: Customers, accounts, transfers, compliance holds
- teller-console: React frontend (Module 4+)
- fraud-service: Real-time fraud scoring (Module 3+)

## Data Storage
- Dev/Test: H2 in-memory, PostgreSQL-compat mode
- No Docker, no external infra

## Non-Negotiables
1. Every money movement auditable
2. No negative balance without overdraft flag
3. All endpoints require JWT except /actuator/health
4. PII masked in logs always