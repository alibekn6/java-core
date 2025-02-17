#!/bin/bash
# Ensure at least one argument is provided
if [ $# -eq 0 ]; then
  echo "Error: Commit message is required."
  echo "Usage: ./commit.sh <commit-message>"
  exit 1
fi

# Combine all arguments into a single commit message
commit_message="$*"

git add -A
git commit -m "$commit_message"
git push