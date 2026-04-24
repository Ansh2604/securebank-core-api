# DEP-2026-01-15-money-as-double

**Source:** PR #14 review
**Reporter:** @platform-lead
**Insight:** Agent used `double` for transfer amount instead of `long cents`
**Deposit Type:** [x] Rule  [ ] Pattern  [ ] Check  [ ] Audit
**Status:** [x] Logged  [ ] Encoded  [ ] Verified  [ ] Merged

## Context
POST /api/transfers accepted amount as Double, causing floating point rounding.

## Root Cause
ADR exists (0003-money-as-cents) but no enforcement — rule not yet in template form.

## Deposit Actions
1. Rewrite money rule in CLAUDE.md using template format (pending)
2. Add ArchUnit test NoDoubleInMoneyFieldsTest (pending)

## Verification
Pending