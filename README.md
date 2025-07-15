# 📝 Journal Application Backend

A RESTful API backend for a personal journaling app that allows users to securely create, manage, and organize their journal entries.

---

## 🚀 Features

- Secure user authentication & authorization using JWT and OAuth2
- Full CRUD operations for journal entries
- User account creation and profile management
- Encrypted storage and secure API endpoints
- Search entries by content, tags, or date
- Organize entries with custom tags
- Retrieve entries by specific dates or date ranges

---

## 🧰 Tech Stack

### 🧱 Framework & Language

- Java
- Spring Boot

### 🗃️ Database & Persistence

- MongoDB
- Spring Data MongoDB

### 🔐 Authentication & Security

- Spring Security
- JWT
- OAuth2
- BCrypt
- CORS Protection
- Hibernate Validator
- Input Validation & Sanitization
- Rate Limiting
- Data Encryption

### ⚡ Caching & Messaging

- Redis
- Apache Kafka

### 📚 API Documentation

- Swagger
- OpenAPI
- springdoc-openapi-ui

### 🛠️ Developer Tools

- Lombok
- Spring Boot DevTools

### 🧪 Testing

- JUnit 5
- Mockito
- Spring Boot Test

### ✅ Code Quality

- SonarQube

### ⚙️ Build & Configuration

- Maven
- application.properties / application.yml

### 📄 Logging & Monitoring

- SLF4J
- Logback

---

## ⚙️ Installation

1. Clone the repository:

```bash
git clone https://github.com/fierce-adventurer/Journal-Application-backend.git
cd Journal-Application-backend
```

2. Set up environment variables:

```bash
cp .env
```

Edit `.env` with your configuration.

3. Install dependencies:

```bash
mvn install
```

4. Start the server:

```bash
mvn spring-boot:run
```

---

## 📘 API Endpoints

Base URL: `http://localhost:8080`

### 📓 Journal Endpoints

- `POST /journal` – Add a new journal entry
- `GET /journal` – Get all journal entries for the authenticated user
- `GET /journal/id/{id}` – Get a specific journal entry by ID
- `DELETE /journal/id/{id}` – Delete a journal entry by ID
- `PUT /journal/id/{id}` – Update a journal entry *(optional/if implemented)*

### 👤 User Endpoints

- `GET /user/greeting` – Authenticated greeting (basic auth)

### 🌐 Public Endpoints

- `GET /public/health-check` – Health check endpoint
- `POST /public/create-user` – Register a new user
- `POST /public/login` – Login user

### 👮 Admin Endpoints

- `GET /admin/getallusers` – Get all users
- `GET /admin/add-admin` – Add a new admin

---

## 🧪 Testing

Run unit and integration tests:

```bash
mvn test
```

Run tests with coverage report:

```bash
mvn test jacoco:report
```

---

## 🔎 API Testing with Swagger

Access Swagger UI:

```bash
http://localhost:8080/swagger-ui.html
```

### Steps to Test

1. Register a user:

```http
POST /api/auth/signup
```

```json
{
  "username": "testuser",
  "email": "test@example.com",
  "password": "securepassword123"
}
```

2. Log in to get JWT token:

```http
POST /api/auth/login
```

```json
{
  "email": "test@example.com",
  "password": "securepassword123"
}
```

3. Authorize Swagger with your JWT:

- Click the `Authorize` button in Swagger UI
- Enter: `Bearer your-jwt-token`

4. Test journal endpoints:

- `POST /journal`
- `GET /journal`
- `GET /journal/id/{id}`
- `DELETE /journal/id/{id}`

---

## 🗃️ Data Models

### User Collection

```json
{
  "id": "UUID",
  "username": "unique",
  "email": "unique",
  "password_hash": "hashed",
  "created_at": "timestamp",
  "updated_at": "timestamp"
}
```

### Journal Entry Collection

```json
{
  "id": "UUID",
  "user_id": "foreign key",
  "title": "string",
  "content": "string",
  "tags": ["string"],
  "mood": "string (optional)",
  "created_at": "timestamp",
  "updated_at": "timestamp"
}
```

---

## 🛡️ Security Features

- BCrypt password hashing
- JWT-based authentication
- OAuth2 login support
- Input validation and sanitization
- CORS configuration
- Rate limiting
- Encryption of sensitive data

---

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch:

```bash
git checkout -b feature/your-feature
```

3. Commit your changes:

```bash
git commit -m "Add your feature"
```

4. Push to GitHub:

```bash
git push origin feature/your-feature
```

5. Open a Pull Request

---

## 🤝 Frontend Contributions

Interested in building the frontend for this journaling application? Here’s how you can contribute:

1. Fork the repository or start a new frontend repo
2. Use a frontend stack such as:
   - **React.js** (preferred) or Vue.js
   - **Tailwind CSS** or Bootstrap for styling
   - **Redux Toolkit** or Context API for state management
   - **Axios** or Fetch API for HTTP requests

3. Connect to the backend API endpoints (see Swagger or README for base paths)
4. Implement key features:
   - Login/Signup pages
   - Journal entry dashboard
   - Entry creation/editing forms
   - Tag filters and mood indicators
   - Profile management

5. Test your UI thoroughly and ensure JWT handling is secure on the frontend
6. Document your setup and submit a pull request or share your frontend repo

Let us know in your PR if you'd like to collaborate on deploying a full-stack version!

---


Made with ❤️ using Spring Boot & MongoDB
