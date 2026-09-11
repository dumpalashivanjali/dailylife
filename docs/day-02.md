# Day 2 — Spring Boot Basics & First REST API

## Objective

Understand the basic Spring Boot application structure and create the first REST API endpoint for DailyLife.

## What I Learned

- `@SpringBootApplication` is the main annotation used to bootstrap a Spring Boot application.
- `SpringApplication.run()` starts the Spring application.
- Spring Boot performs component scanning to discover Spring-managed components.
- `@RestController` identifies a class as a REST controller.
- `@GetMapping` maps an HTTP GET request to a Java method.
- A controller can return data directly as an HTTP response.
- A `404 Not Found` response from `/` does not necessarily mean the application is broken. It can simply mean that no endpoint is mapped to `/`.

## First REST Controller

Created:

```text
backend/src/main/java/com/dailylife/dailylife/controller/HelloController.java

The controller exposes:

GET /api/hello

The endpoint returns:

Hello from DailyLife!
Application Structure

The application entry point is:

com.dailylife.dailylife.DailylifeApplication

The controller is placed in a subpackage:

com.dailylife.dailylife.controller

This allows Spring Boot's component scanning to discover the controller.

API Verification

The backend was started using:

./mvnw spring-boot:run -DskipTests

The endpoint was tested using:

curl http://localhost:8080/api/hello

Response:

Hello from DailyLife!

This confirms that the request successfully reached the Spring Boot application and was handled by HelloController.

Maven Build

The application was packaged successfully using:

./mvnw package -DskipTests

The build completed with:

BUILD SUCCESS

Spring Boot also successfully created the executable JAR:

target/dailylife-0.0.1-SNAPSHOT.jar
Maven Dependency Issue

During the build, Maven encountered intermittent:

bad_record_mac
Tag mismatch

errors while downloading dependencies from Maven Central.

The affected dependencies included:

org.junit.platform:junit-platform-launcher
org.apache.commons:commons-lang3
com.github.luben:zstd-jni

The issue was resolved by removing the affected local Maven artifact and downloading the problematic zstd-jni artifact again.

The application itself was not the cause of the error.

Key Concepts
@SpringBootApplication

Marks the main Spring Boot application class and enables Spring Boot configuration, auto-configuration, and component scanning.

@RestController

Marks a class as a REST controller whose methods can handle HTTP requests and return response data.

@GetMapping

Maps an HTTP GET request to a specific controller method.

Example:

@GetMapping("/api/hello")
public String hello() {
    return "Hello from DailyLife!";
}
Day 2 Result

The DailyLife backend now has its first working REST API endpoint.

GET /api/hello
        ↓
HelloController
        ↓
Hello from DailyLife!
Next Step

Day 3 — REST API design and task management domain.
