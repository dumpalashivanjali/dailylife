# Day 05 — Validation & Exception Handling

## 🎯 Goal

Improve the Task Manager API by adding input validation
and clean error handling.

## 🛠️ What We Built

### 1. Request Validation

Added Spring Boot validation dependency.

Used:

- `@NotBlank` in `Task.java`
- `@Valid` in `TaskController.java`

The Task title cannot be empty.

### 2. Global Exception Handling

Created:

`GlobalExceptionHandler.java`

Used:

- `@RestControllerAdvice`
- `@ExceptionHandler`

Validation errors now return a simple JSON response.

Example:

```json
{
  "title": "Title cannot be empty"
}




🔄 API Flow
Client
  ↓
Controller
  ↓
@Valid
  ↓
Validation
  ↓
Service
  ↓
Repository
  ↓
Database

If validation fails:

Invalid Request
      ↓
Validation Error
      ↓
GlobalExceptionHandler
      ↓
Clean JSON Response
🧪 Testing
Invalid POST

An empty title was rejected:

{
  "title": "Title cannot be empty"
}
Valid POST

A task was successfully created.

Invalid PUT

An empty title was rejected:

{
  "title": "Title cannot be empty"
}
Valid PUT

Task ID 1 was successfully updated.

Verified with:

GET /api/tasks/1

Result:

{
  "id": 1,
  "title": "Learn Spring Boot Validation",
  "description": "Updated on Day 05",
  "completed": true
}
🧠 Key Learning
Validation prevents invalid data from entering the application.
@NotBlank checks that a text field is not empty.
@Valid activates validation for incoming request data.
@RestControllerAdvice handles exceptions globally.
Clean error responses make APIs easier for clients to understand.
✅ Day 05 Status
 Added validation dependency
 Added @NotBlank
 Added @Valid to POST
 Added global exception handler
 Added @Valid to PUT
 Tested invalid requests
 Tested valid requests
 Verified database update

### After saving

Run:

```bash
git status