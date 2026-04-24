# DEP-2026-01-14-missing-idempotency

**Source:** PR #14 review
**Reporter:** @platform-lead
**Insight:** POST /api/transfers accepted requests without idempotencyKey
**Deposit Type:** [x] Rule  [ ] Pattern  [ ] Check  [ ] Audit
**Status:** [x] Logged  [ ] Encoded  [ ] Verified  [ ] Merged

## Context
Duplicate submissions could double-charge customers.

## Root Cause
Spec missed idempotency; agent followed spec literally.

## Deposit Actions
1. Update docs/requirements/REQ-XFER-010.md to require idempotencyKey
2. Add hook that blocks Edit on transfer controller without idempotency check

## Verification
Pending encoding.