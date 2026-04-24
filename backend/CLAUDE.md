# Backend Conventions

## Scope
All production Java code under src/main/java/com/securebank/*

## Patterns
- Package-by-feature (account/, transfer/, compliance/)
- Constructor injection only
- Money always `long` cents
- Controllers return ResponseEntity<ApiResponse<T>>

## Gotchas
- Never return full account numbers in lists — mask to last 4 digits
- Use Instant for timestamps, never LocalDateTime