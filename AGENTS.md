# AGENTS.md — Navigation for AI Agents

## Start Here
- docs/architecture/overview.md   — System shape, layers, boundaries
- docs/specs/INDEX.md             — Active and completed feature specs

## When to Read What

### For ANY code change
- CLAUDE.md (root)                — repository-wide conventions
- docs/architecture/service-boundaries.md  — what depends on what

### For backend changes
- backend/CLAUDE.md               — backend-specific rules
- docs/schemas/openapi.yaml       — API contracts
- docs/schemas/database.dbml      — database schema

### For frontend changes
- frontend/CLAUDE.md              — frontend-specific rules
- docs/design/user-flows.md       — UX context

### When modifying auth
- docs/architecture/decisions/0002-auth-via-jwt.md  — mandatory read

## Skills Available
- .claude/skills/feature-spec/    — generate a spec from a ticket
- .claude/skills/adr-writer/      — draft a new ADR
- .claude/skills/migration/       — generate DB migrations

## Hooks Active
- .claude/hooks/pre-commit-lint.sh  — blocks style violations
- .claude/hooks/pre-push-test.sh    — blocks on test failures