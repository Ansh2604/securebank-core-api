# SecureBank Core Banking API


<!-- version: 1.0.0 -->

# SecureBank Core Banking API

<!-- version: 2.0.0 -->
<!-- updated: 2026-01-15 -->
<!-- owners: @platform-team -->

## Changelog
- 2.0.0 (2026-01-15): Added AGENTS.md navigation; docs/ structure; deposit rule
- 1.0.0 (2026-01-05): Initial bootstrap rules


## Stack
- Java 21 + Spring Boot 3.3
- H2 database (embedded, in-memory, PostgreSQL compatibility mode)
- Flyway migrations
- Maven 3.9+
- JUnit 5

## Database Notes
- Use H2 embedded — NO external database, NO Docker
- Configured in PostgreSQL-compat mode for portability
- H2 Console at /h2-console for inspection
- JDBC URL: jdbc:h2:mem:securebank

## Conventions
- Package-by-feature under com.securebank.<feature>
- Money always `long` cents — never double or BigDecimal
- Use constructor injection — never field injection
- Use `record` for DTOs

## Commands
- mvn spring-boot:run    — start on :8080
- mvn test               — run tests