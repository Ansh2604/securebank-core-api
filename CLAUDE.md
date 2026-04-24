# SecureBank Core Banking API

<!-- version: 1.0.0 -->

## Project Intent
Core banking REST API handling customers, accounts, transactions,
transfers, and compliance holds.

## Stack
- Java 21 + Spring Boot 3.3
- H2 Database (embedded, in-memory, PostgreSQL compatibility mode)
- Flyway migrations
- Maven 3.9+

## Repository Structure
- src/main/java/com/securebank/       — Production code (package-by-feature)
- src/main/resources/                 — Config + Flyway migrations
- src/test/java/com/securebank/       — Tests
- docs/                               — Specs, ADRs, runbooks
- .claude/                            — Hooks, skills, settings

## Global Conventions
- Package-by-feature (customer/, account/, transfer/...)
- Monetary values stored as `long` representing cents
- Constructor injection only — never field injection
- `record` for DTOs
- Use Instant (never LocalDateTime) for timestamps

## Commands
- mvn spring-boot:run      — start API on :8080
- mvn test                 — run all tests

## Git Workflow
- Branches: feature/<req-id>-short-slug
- Commits: conventional commits
- PR titles: [REQ-XXX] short description