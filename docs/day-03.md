# Day 3 — Task Manager Backend

## Context

Today I continued building the DailyLife Task Manager backend using Spring Boot.

### What I learned and completed

* Created a `Task` model to represent a task.
* Converted `Task` into a JPA `@Entity` so it can be stored in the database.
* Used `@Id` and `@GeneratedValue` for automatic task IDs.
* Added Spring Data JPA and H2 database dependencies.
* Configured the H2 database in `application.properties`.
* Created `TaskRepository` using `JpaRepository`.
* Created `TaskController` for REST APIs.
* Implemented CRUD operations:

  * `POST /api/tasks` — Create a task
  * `GET /api/tasks` — Read all tasks
  * `PUT /api/tasks/{id}` — Update a task
  * `DELETE /api/tasks/{id}` — Delete a task
* Tested the APIs successfully using `curl`.
* Created, retrieved, updated, and deleted a real task from the database.
* Cleaned generated H2 database files from Git tracking.
* Added `backend/data/` to `.gitignore`.

### Technologies

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* H2 Database
* Maven
* REST API
* Git

### Day 3 Result

The DailyLife backend now has a working database and complete CRUD functionality for tasks.

I successfully connected the Spring Boot application to H2 and verified that tasks can be created, read, updated, and deleted.
