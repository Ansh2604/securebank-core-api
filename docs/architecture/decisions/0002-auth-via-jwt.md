# ADR 0002: Authentication via JWT (HS256)

Date: 2026-01-05
Status: Accepted

## Context
Customer-facing auth: stateless, short-lived, revocable.

## Decision
HS256-signed JWTs. Shared secret per env. 15-min customer tokens.

## Rationale
- HS256 simpler than RS256 for single issuer
- Short expiry limits replay window
- Mobile-friendly (no cookies)

## Consequences
- Refresh-token endpoint required (future)
- All endpoints except /actuator/health + /api/auth/* require JWT