# DEP-2026-01-15-mutable-entity

**Source:** PR #15 review
**Reporter:** @backend-lead
**Insight:** Agent made Transaction entity mutable with setters
**Deposit Type:** [x] Rule  [ ] Pattern  [ ] Check  [ ] Audit
**Status:** [x] Logged  [ ] Encoded  [ ] Verified  [ ] Merged

## Context
Ledger entries should be immutable (audit requirement).

## Root Cause
No CLAUDE.md rule about entity immutability for ledger tables.

## Deposit Actions
1. Add rule "Ledger entities (Transaction, Transfer) must be immutable"
2. Add ArchUnit test (Module 3)

## Verification
Pending.