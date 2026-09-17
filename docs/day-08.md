# Day 08 – Improve Swagger / OpenAPI Documentation

## What I learned

- Improved Swagger documentation for the Task API.
- Used `@Tag` to group and describe the Task APIs.
- Used `@Operation` to add summaries and descriptions to API endpoints.
- Used `@ApiResponse` to document possible HTTP responses.
- Added an `OpenApiConfig` class to customize API information.
- Configured:
  - API title: Task Manager API
  - Version: 1.0
  - Description: REST API for managing daily tasks
- Updated the Create Task API to return `201 Created`.

## Swagger UI

Swagger UI:
`http://localhost:8080/swagger-ui/index.html`

## Task API Endpoints

- GET `/api/tasks` – Get all tasks
- GET `/api/tasks/{id}` – Get task by ID
- POST `/api/tasks` – Create a new task
- PUT `/api/tasks/{id}` – Update a task
- DELETE `/api/tasks/{id}` – Delete a task

## Architecture

Swagger UI  
↓  
Controller  
↓  
Service  
↓  
Repository  
↓  
Database

## Verification

- `./mvnw clean install` – successful
- Swagger UI opened successfully.
- All Task CRUD endpoints were visible and documented.