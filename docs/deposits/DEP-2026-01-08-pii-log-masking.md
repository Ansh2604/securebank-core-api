# DEP-2026-01-08-pii-log-masking

**Source:** PR #7 review
**Reporter:** @platform-lead
**Insight:** Agent logged full account numbers at INFO level
**Deposit Type:** [x] Rule  [ ] Pattern  [x] Check  [ ] Audit
**Status:** [x] Logged  [x] Encoded  [x] Verified  [x] Merged

## Context
In ComplianceService.placeHold, log.info("hold placed for account {}", accountNumber)
leaked 12-digit account numbers to the log aggregator.

## Root Cause
No CLAUDE.md rule prohibited logging PII. No hook scanned for PII.

## Deposit Actions
1. Appended "Logging" section to src/main/java/com/securebank/CLAUDE.md
2. Created .claude/hooks/pre-edit-pii-log-scanner.py
3. Created docs/patterns/safe-logging.md with mask() helper

## Verification
- Hook fires on re-introduction attempt — verified
- Rule invoked by 3 subsequent PRs — verified