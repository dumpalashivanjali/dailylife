# Day 06 — DTOs (Data Transfer Objects)

## What I learned today

Today I learned about **DTOs (Data Transfer Objects)**.

A DTO is used to transfer data between the **client and application** without directly exposing the database Entity.

## Entity vs DTO

### Entity

`Task` is our Entity.

It represents the data stored in the database.

```text
Task
├── id
├── title
├── description
└── completed
```

### TaskRequest

`TaskRequest` contains the data that the client sends to the API.

```text
TaskRequest
├── title
├── description
└── completed
```

We don't include `id` because the database generates it.

### TaskResponse

`TaskResponse` contains the data that our API sends back to the client.

```text
TaskResponse
├── id
├── title
├── description
└── completed
```

## API Flow

### POST

```text
Client
↓
TaskRequest
↓
Controller
↓
Service
↓
Task Entity
↓
Repository
↓
Database
↓
TaskResponse
↓
Client
```

### GET

```text
Database
↓
Task Entity
↓
TaskResponse
↓
Client
```

### PUT

```text
Client
↓
TaskRequest
↓
Service
↓
Task Entity
↓
Database
↓
TaskResponse
↓
Client
```

## Why do we use DTOs?

DTOs help us:

* Keep API data separate from database data
* Avoid exposing the Entity directly
* Control what data the client can send
* Control what data the API returns
* Keep the application clean and easier to maintain

## Important learning

**Entity = Database**

**Request DTO = Data coming into the API**

**Response DTO = Data going out of the API**

```text
Client
↕
DTO
↕
Service
↕
Entity
↕
Database
```

## Day 06 Result

I successfully created:

* `TaskRequest.java`
* `TaskResponse.java`

and converted the POST, GET and PUT APIs to use DTOs.

I also tested the APIs successfully using `curl`.
