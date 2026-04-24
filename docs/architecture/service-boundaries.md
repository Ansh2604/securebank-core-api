# Service Boundaries & Contracts

## core-api ↔ fraud-service
- Transport: REST, 500ms timeout
- Contract: POST /v1/risk/score → { score: 0-100, reasons: [] }

## core-api ↔ teller-console
- Transport: HTTPS REST with JWT
- Contract: docs/schemas/openapi.yaml

## Internal Boundaries (within core-api)
- domain/ pure — no Spring, no JPA
- application/ orchestrates — may call domain, defines repository interfaces
- infrastructure/ implements interfaces — JPA, HTTP clients
- api/ adapts HTTP — calls application, never domain directly