# DEP-2026-01-08-log-masking

**Source:** PR #7 review (REQ-HOLD-020)
**Reporter:** @platform-lead
**Insight:** Agent logged full account numbers at INFO level
**Deposit Type:** [x] Rule  [ ] Pattern  [x] Check  [ ] Audit
**Status:** [x] Logged  [x] Encoded  [x] Verified  [x] Merged

## Context
`log.info("hold placed for account {}", accountNumber)` leaked 12-digit
account numbers to the log aggregator.

## Root Cause
No CLAUDE.md rule prohibited logging PII. No hook scanned for PII in logs.

## Deposit Actions
1. Append Logging section to src/main/java/com/securebank/CLAUDE.md
2. Create .claude/hooks/pre-edit-pii-log-scanner.py
3. Create docs/patterns/safe-logging.md with `mask(accountNumber)` helper

## Verification
Hook blocks reintroduction; agent generates masked logs on fresh prompt.