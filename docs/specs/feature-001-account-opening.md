# Feature 001: Account Opening

## Intent
KYC-verified customer opens a new savings or checking account.

## User Stories (EARS)
- When a KYC-verified customer submits customerId + accountType,
  the system shall create an Account with 0 balance and return 201.
- When a non-KYC customer submits the same, the system shall return 403.

## API Changes
POST /api/accounts — see docs/schemas/openapi.yaml

## Test Scenarios
- Happy path: verified customer opens SAVINGS
- Error path: non-KYC customer
- Edge case: invalid accountType