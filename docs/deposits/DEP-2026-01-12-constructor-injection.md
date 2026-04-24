# DEP-2026-01-12-constructor-injection

**Source:** PR #11 review
**Reporter:** @backend-lead
**Insight:** Agent used @Autowired field injection instead of constructor injection
**Deposit Type:** [x] Rule  [x] Pattern  [ ] Check  [ ] Audit
**Status:** [x] Logged  [x] Encoded  [ ] Verified  [ ] Merged

## Context
TransferService used @Autowired on private fields. Violates testability rule.

## Root Cause
CLAUDE.md mentioned constructor injection but didn't justify it.

## Deposit Actions
1. Updated root CLAUDE.md with full rule template including rationale
2. Added pattern example to docs/patterns/constructor-injection.md
3. Checkstyle rule (pending verification)

## Verification
Pending — awaiting next PR to confirm rule is auto-applied