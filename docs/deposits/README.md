# Knowledge Deposits — SecureBank Sprint Discipline

## The Rule
Every review insight, bug post-mortem, or "agent got this wrong" moment
must be encoded back into the context system within the same sprint it
was discovered.

## The Deposit Cycle
Review finds issue → Classify insight type
  ├─ Rule?     → Append to the relevant CLAUDE.md
  ├─ Pattern?  → Add example to docs/patterns/ or new skill
  ├─ Check?    → Add to .claude/hooks/
  └─ Audit?    → Append to .claude/skills/reviewer/SKILL.md
  → Commit with linked PR reference
  → Sprint close: count deposits as deliverable

## Filename Convention
docs/deposits/DEP-<YYYY-MM-DD>-<short-slug>.md

## Status Lifecycle
[ ] Logged → [ ] Encoded → [ ] Verified → [ ] Merged