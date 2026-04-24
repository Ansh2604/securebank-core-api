# Runbook: Incident Response

## First 5 Minutes
1. curl localhost:8080/actuator/health | jq
2. Check recent deploys via git log
3. Check H2 console for table counts: http://localhost:8080/h2-console
4. Review ERROR logs

## Escalation
If error rate > 5% for 10 minutes: rollback immediately via git revert.