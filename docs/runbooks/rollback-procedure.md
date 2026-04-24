# Runbook: Rollback Procedure

## Steps
1. Identify last good SHA: `git log --oneline -20`
2. Create revert commit: `git revert <bad-sha>`
3. Push: `git push`
4. Verify /actuator/health UP within 2 minutes
5. Write post-mortem as a deposit in docs/deposits/