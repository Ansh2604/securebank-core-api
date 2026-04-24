# DEP-2026-01-10-constructor-injection

**Source:** PR #9 review
**Reporter:** @backend-lead
**Insight:** Agent generated @Autowired field injection in TransferService
**Deposit Type:** [x] Rule  [ ] Pattern  [x] Check  [ ] Audit
**Status:** [x] Logged  [x] Encoded  [x] Verified  [x] Merged

## Context
Four services used @Autowired private fields instead of constructor injection.

## Root Cause
CLAUDE.md said "prefer constructor injection" but without enforcement.

## Deposit Actions
1. Strengthen rule in CLAUDE.md to "ALWAYS constructor injection; NEVER field"
2. Add Checkstyle rule flagging @Autowired on fields
3. Planned: ArchUnit test (Module 3)

## Verification
Checkstyle fails the build on reintroduction.