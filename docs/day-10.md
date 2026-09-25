# Day 10 — H2 to PostgreSQL Migration

## Completed

* Configured PostgreSQL 18.6
* Set the PostgreSQL `postgres` user password
* Created the `dailylife` PostgreSQL database
* Migrated Spring Boot datasource from H2 to PostgreSQL
* Added PostgreSQL JDBC driver
* Removed H2 dependency
* Configured JPA/Hibernate for PostgreSQL
* Started the application successfully
* Tested the Task API with PostgreSQL
* Created a test task through the API
* Retrieved the task through the API
* Verified the task directly in PostgreSQL

## PostgreSQL Configuration

Database:
`dailylife`

Host:
`localhost`

Port:
`5432`

User:
`postgres`

## Verification

API:

`GET /api/tasks`

Returned the PostgreSQL migration test task successfully.

PostgreSQL:

`SELECT * FROM task;`

Confirmed that the task was stored in the PostgreSQL `task` table.

## Result

The DailyLife Task Manager is now using PostgreSQL instead of H2.
