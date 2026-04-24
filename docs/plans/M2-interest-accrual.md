# Plan: End-of-Day Interest Accrual

## Objective
Scheduled worker accrues interest nightly on SAVINGS accounts.

## Phases
- [ ] Phase 1: Worker scaffold + @Scheduled (PR #1)
- [ ] Phase 2: Accrual calculation service (PR #2)
- [ ] Phase 3: Two-leg Transaction posting (PR #3)
- [ ] Phase 4: Observability (PR #4)
- [ ] Phase 5: Runbook (PR #5)

## Contracts
- Runs nightly at 23:59 UTC
- Annual rate 2.5% on SAVINGS
- Skips accounts with active ComplianceHold

## Agent Instructions
- Use skill .claude/skills/migration/ for new tables
- Every PR appends to docs/deposits/ if review surfaces an insight