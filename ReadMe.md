# Spring Boot MongoDB CRUD

A simple **Spring Boot** project demonstrating CRUD operations with **MongoDB Atlas**.  
This project uses Spring Data MongoDB and provides REST APIs to manage tasks.

---

## 🚀 Features

- Add a new task
- Get all tasks
- Get task by ID
- Get tasks by severity
- Get tasks by assignee
- Update a task
- Delete a task

---

## 📦 Technology Stack

- Java 17+
- Spring Boot
- Spring Data MongoDB
- MongoDB Atlas
- Maven

---

## 📁 Project Structure

```
src/
 ├─ main/
 │   ├─ java/com/springboot/mongodb_crud/
 │   │    ├─ entity/      # Task entity
 │   │    ├─ repository/  # MongoDB repository
 │   │    ├─ service/     # Service interface
 │   │    └─ service/impl # Service implementation
 │   │    └─ controller/  # REST controllers
 │   └─ resources/
 │        └─ application.yml
```

---

## ⚙️ Configuration

1. Create a MongoDB Atlas cluster.
2. Add your IP to the Network Access whitelist.
3. Create a database user.
4. Fill in your connection string in `application.yml`:

```yaml
spring:
  data:
    mongodb:
      uri:
      database:
```

---

## 🔗 API Endpoints

| Method | Endpoint                 | Description           |
| ------ | ------------------------ | --------------------- |
| POST   | `/tasks`                 | Create a new task     |
| GET    | `/tasks`                 | Get all tasks         |
| GET    | `/tasks/{id}`            | Get task by ID        |
| GET    | `/tasks/severity/{sev}`  | Get tasks by severity |
| GET    | `/tasks/assignee/{name}` | Get tasks by assignee |
| PUT    | `/tasks`                 | Update a task         |
| DELETE | `/tasks/{id}`            | Delete a task         |

---
