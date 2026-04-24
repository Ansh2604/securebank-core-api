# DEP-2026-01-12-money-as-double

**Source:** PR #11 review
**Reporter:** @platform-lead
**Insight:** Agent used `double amount` in TransferRequest DTO
**Deposit Type:** [x] Rule  [ ] Pattern  [ ] Check  [ ] Audit
**Status:** [x] Logged  [x] Encoded  [ ] Verified  [ ] Merged

## Context
Money as double — classic rounding bug risk.

## Root Cause
CLAUDE.md had the rule but without an explicit example.

## Deposit Actions
1. Add ADR 0003-money-as-cents-long.md
2. Add canonical example to docs/patterns/money.md

## Verification
Pending: ArchUnit test in Module 3.