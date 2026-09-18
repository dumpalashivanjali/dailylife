# Day 9 — PostgreSQL Installation

## What I learned

- Learned that the project is currently using H2 as the database.
- Installed PostgreSQL for the DailyLife Task Manager project.
- Installed PostgreSQL 18.6 on Windows.
- Learned about the PostgreSQL command-line tool `psql`.
- Added PostgreSQL's `bin` folder to the Windows Environment Variables PATH.
- Verified that PostgreSQL can be accessed from Git Bash.

## Current Database

The project is currently using H2:

```properties
spring.datasource.url=jdbc:h2:file:./data/dailylife
spring.datasource.driver-class-name=org.h2.Driver


PostgreSQL has been installed, but the Spring Boot project has not been migrated yet.

PostgreSQL Verification

Command:

psql --version

Result:

psql (PostgreSQL) 18.6
Today's Progress
PostgreSQL Installation
        ↓
PostgreSQL 18.6
        ↓
PATH Configuration
        ↓
psql Verification
        ↓
Completed