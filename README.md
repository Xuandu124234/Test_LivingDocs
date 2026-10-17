# User Service

A small Spring Boot service for managing user accounts.

## Endpoints
- `POST /api/users` - Create a new user
- `GET /api/users/{id}` - Get a user by id

## Architecture
- `User` - domain entity
- `UserService` - business logic with in-memory store
- `UserController` - REST API
