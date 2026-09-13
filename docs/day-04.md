# Day 04 — Service Layer & Error Handling

## What I learned

### Backend flow

Controller → Service → Repository → Database

* **Controller** → Receives HTTP requests.
* **Service** → Contains business logic and decides what to do.
* **Repository** → Gets/saves data in the database.
* **Database** → Stores the actual task data.

### What I built

* Created `TaskService.java`.
* Moved task operations from Controller to Service.
* Added `GET /api/tasks/{id}` to get one task.
* Added proper `404 Not Found` when a task doesn't exist.
* Improved task update so it checks if the task exists first.
* Improved task deletion with proper `404` handling.
* Used `204 No Content` when a task is successfully deleted.
* Ran `./mvnw clean test` successfully after the changes.

## Important concept

**Controller asks → Service thinks → Repository fetches/saves → Database stores.**

## Architecture

Controller
↓
Service
↓
Repository
↓
Database

## Git

Committed the Day 4 changes with Git and pushed them to GitHub.
