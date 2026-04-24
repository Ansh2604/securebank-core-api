# Knowledge Deposits — SecureBank

## The Rule
Every review insight, bug post-mortem, or "agent got this wrong" moment
must be encoded back into the context system within the same sprint.

## The Deposit Cycle
Review finds issue → Classify insight type
  ├─ Rule?     → Append to relevant CLAUDE.md
  ├─ Pattern?  → Add to .claude/skills/
  ├─ Check?    → Add to .claude/hooks/
  └─ Audit?    → Append to .claude/skills/reviewer/
  → Commit with linked PR reference
  → Sprint close: count as deliverable

## Filename Convention
docs/deposits/DEP-<YYYY-MM-DD>-<short-slug>.md

## Status Lifecycle
[ ] Logged → [ ] Encoded → [ ] Verified → [ ] Merged

## Metrics We Track
- Deposit-per-insight ratio (target: ≥ 80%)
- Rule invocation count (should grow)
- Repeat-finding rate (should decline)