# Lab02 — Branching, Merge, Rebase, PR

Minimal Java CLI project for practicing Git branching workflows.

## Run from repository root

```bash
javac -d /tmp/devops-lab02-classes lab02/src/GreetingApp.java
java -cp /tmp/devops-lab02-classes GreetingApp
```

Expected initial output: `Hello, DevOps!`

## Files

- `src/GreetingApp.java`: application entry point
- `app.properties`: greeting configuration
- `conflict.txt`: dedicated file for an intentional merge conflict

## Lab objectives

1. Start `feature/greeting` and `feature/config` from `main`.
2. Make two Conventional Commits on each feature branch.
3. Merge the first branch with `--no-ff`; rebase the second onto `main` and fast-forward merge it.
4. Intentionally cause and resolve a conflict.
5. Create a PR for the lab report and obtain one real review comment.
6. Protect `main` and create the `v0.1.0` annotated tag.

Keep terminal screenshots of `git log --oneline --graph --decorate --all` for both cases and a screenshot of the branch protection settings.
