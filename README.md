# Coworking Space — SAAD CAUFY

Full-stack coworking space reservation and management platform built with **Spring Boot 3**, **PostgreSQL**, and **React**.

## Student

**SAAD CAUFY**

## Technologies

### Backend
- Java 17
- Spring Boot 3.2.4
- Spring Web
- Spring Data JPA / Hibernate
- Spring Security
- JWT authentication
- Bean Validation
- PostgreSQL
- Swagger / OpenAPI
- Maven

### Frontend
- React
- Vite
- React Router
- Axios
- Lucide React

## Main Features

- User authentication and registration
- JWT-based authorization
- Role-based access control
- Workspace and desk management
- Workspace availability
- Booking creation and management
- Booking cancellation, check-in and check-out
- Amenity management and reservations
- Member dashboard
- Space manager dashboard
- Administrator dashboard
- User management
- Booking and utilization reports
- Centralized API error handling
- DTO-based request handling and validation

## Project Structure

```text
coworking-space-saad-caufy/
├── backend/
│   ├── src/main/java/ma/caufysaad/coworking/
│   ├── src/main/resources/
│   └── pom.xml
└── frontend/
    ├── src/
    ├── package.json
    └── vite.config.js
```

## Backend Configuration

The application uses PostgreSQL. Environment variables can be used to configure the database and JWT:

- `DB_URL` — default: `jdbc:postgresql://localhost:5432/coworking_space_db`
- `DB_USERNAME` — default: `postgres`
- `DB_PASSWORD` — default: `root`
- `JWT_SECRET` — JWT signing secret
- `JWT_EXPIRATION_MS` — token expiration in milliseconds
- `PORT` — backend port, default: `8080`

Create the PostgreSQL database before starting the backend:

```sql
CREATE DATABASE coworking_space_db;
```

## Run the Backend

From the `backend` directory:

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

The API runs by default on:

```text
http://localhost:8080
```

Swagger UI:

```text
http://localhost:8080/swagger-ui.html
```

## Run the Frontend

From the `frontend` directory:

```bash
npm install
npm run dev
```

The frontend runs by default on the Vite development server.

To use another backend URL, create a frontend `.env` file:

```env
VITE_API_BASE_URL=http://localhost:8080/api
```

## Academic Project

Master 2 — Academic Year 2025–2026
