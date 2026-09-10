# Day 1 — Project Architecture, Git & Maven

## Objective

Set up the DailyLife project, understand the basic project architecture, initialize Git/GitHub, and create the Spring Boot backend.

## What I Learned

- DailyLife will be built as a full-stack application.
- The backend will use Java and Spring Boot.
- Maven is used as the build and dependency management tool.
- Git tracks changes in the project.
- GitHub stores the remote Git repository.
- Spring Boot can run an embedded Tomcat web server.
- The backend currently runs on port 8080.

## Project Structure

```text
dailylife/
├── backend/
│   ├── src/
│   ├── .mvn/
│   ├── mvnw
│   ├── mvnw.cmd
│   └── pom.xml
├── docs/
│   └── day-01.md
├── .gitignore
└── README.md



Today's Work
Git and GitHub
Created the DailyLife Git repository.
Initialized the local Git repository.
Changed the default branch to main.
Connected the local repository to GitHub.
Successfully pushed the project to GitHub.
Spring Boot Setup
Created the Spring Boot backend using Spring Initializr.
Spring Boot version: 4.1.1
Java runtime: 24.0.1
Java compiler target: 21
Build tool: Maven.
Successfully compiled the Spring Boot application.
Successfully started the Spring Boot application.
Embedded Tomcat started on port 8080.
Backend Verification

The application was started using:

./mvnw spring-boot:run -DskipTests

The application successfully started with:

Tomcat started on port 8080
Started DailylifeApplication

The server was tested using:

curl http://localhost:8080

The server returned:

{
  "status": 404,
  "error": "Not Found",
  "path": "/"
}

This is expected because no controller or endpoint has been created yet. The response confirms that the request successfully reached the Spring Boot application.

Problems Encountered
Maven Dependency Download Issue

Maven initially encountered intermittent bad_record_mac errors while downloading dependencies from Maven Central.

The issue appeared to be related to Maven's dependency transfer rather than the application code. Direct downloads using curl worked successfully.

After resolving the required dependencies, the project compiled and the Spring Boot application started successfully.

What I Understand Now

I understand that Spring Boot provides the foundation for the backend application. Maven manages project dependencies and the build lifecycle.

When the application starts, Spring Boot initializes the application context and starts an embedded Tomcat server. The backend is currently listening on port 8080.

I also understand that a 404 response from / does not necessarily mean the application is broken. It can simply mean that there is no controller endpoint mapped to that URL.

Next Step

Day 2 — Spring Boot Basics.


Save the file.

### Step 3 — Check what Git sees

Run:

```bash
git status