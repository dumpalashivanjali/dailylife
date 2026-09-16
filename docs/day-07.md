# Day 07 — Swagger / OpenAPI

## What I learned today

Today I learned about **Swagger / OpenAPI** and how it helps us document and test our REST APIs.

Swagger provides an interactive web interface where we can see all the API endpoints of our application and test them directly from the browser.

## What we did today

I added the **SpringDoc OpenAPI** dependency to our Spring Boot project.

I then built the project successfully using:

./mvnw clean install

After starting the application, I opened Swagger UI at:

http://localhost:8080/swagger-ui/index.html

Swagger automatically detected the APIs from our `TaskController`.

## APIs available in Swagger

GET    /api/tasks
GET    /api/tasks/{id}
POST   /api/tasks
PUT    /api/tasks/{id}
DELETE /api/tasks/{id}

It also detected:

GET /api/hello

## How Swagger fits into our project

Swagger does not replace our existing application layers.

Our normal application flow is:

Client
↓
Controller
↓
Service
↓
Repository
↓
Database

Swagger provides an interface to interact with the API:

Swagger UI
↓
API Endpoint
↓
Controller
↓
Service
↓
Repository
↓
Database

For example, instead of using `curl` to test a POST API, we can open the POST endpoint in Swagger UI, provide the request data, and execute it directly from the browser.

## Why Swagger is useful

Swagger helps us:

* View all available API endpoints
* Understand which HTTP methods are available
* See request and response information
* Test APIs directly from the browser
* Make API documentation easier to understand
* Reduce the need to use `curl` for every API test

## Important learning

**Swagger / OpenAPI = Documentation and testing interface for our APIs**

**Controller = Handles API requests**

Swagger helps us interact with the APIs that we have already built.

## Day 07 Result

I successfully added **Swagger / OpenAPI** to the Task Manager project, built the project successfully using `./mvnw clean install`, opened Swagger UI, and verified that our Task CRUD APIs are displayed and available for testing through the browser.