# Day 1 — Project Architecture, Git & Maven

## Objective

Set up the DailyLife project repository and understand the basic project architecture, Git workflow, and Maven's role in a Java/Spring Boot project.

## Project

DailyLife is a personal productivity application combining:

* Task Manager
* Diary
* AI Assistant

The planned architecture is:

```text
React Web App
      ↓
Spring Boot REST API
      ↓
PostgreSQL
      ↓
Spring AI
      ↓
LLM + RAG
```

## What I Learned

### Git

Git is the version control system used to track changes to the project.

Basic workflow:

```text
Working Directory
      ↓
   git add
      ↓
Staging Area
      ↓
  git commit
      ↓
Local Repository
      ↓
   git push
      ↓
GitHub
```

### GitHub

GitHub will be used as the remote repository for DailyLife.

### Maven

Maven is the build and dependency-management tool that will be used for the Spring Boot backend.

It will manage things such as:

* Project dependencies
* Build lifecycle
* Testing
* Packaging

## Project Structure

```text
dailylife/
├── backend/
├── frontend/
├── docs/
└── README.md
```

## Today's Work

* Created the DailyLife repository
* Initialized Git
* Created the initial project structure
* Created the Day 1 documentation
* Prepared the repository for the Spring Boot backend


## What I Understand Now

1. Git vs Github
2. Architecture of the project
3. Creating project structure locally


## Next Step

Day 2 — Spring Boot basics.
