#!/usr/bin/env python3
import sys, json, os, datetime

payload = json.loads(sys.stdin.read())
tool = payload.get("tool_name", "")
tool_input = payload.get("tool_input", {})

# Extract most useful fields based on tool type
detail = ""
if tool == "Read":
    detail = tool_input.get("file_path", "")
elif tool in ("Edit", "Write"):
    detail = tool_input.get("file_path", "")
elif tool == "Bash":
    detail = tool_input.get("command", "")[:80]
elif tool == "Glob":
    detail = tool_input.get("pattern", "")

ts = datetime.datetime.now().strftime("%H:%M:%S")
line = f"[{ts}] {tool}: {detail}\n"

# Write to log file
os.makedirs(".claude/logs", exist_ok=True)
with open(".claude/logs/tool-use.log", "a") as f:
    f.write(line)

# Echo to stderr so it's visible in the Claude Code terminal
sys.stderr.write(f"🔎 HOOK: {tool} → {detail}\n")
sys.stderr.flush()

print(json.dumps({"decision": "allow"}))