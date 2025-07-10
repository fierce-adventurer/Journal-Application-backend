📝 Journal Application Backend

- A RESTful API backend for a personal journaling app that allows users to securely create, manage, and organize their journal entries.


🚀 Features
- Secure user authentication & authorization using JWT and OAuth2

- Full CRUD operations for journal entries

- User account creation and profile management

- Encrypted storage and secure API endpoints

- Search entries by content, tags, or date

- Organize entries with custom tags

- Retrieve entries by specific dates or date ranges

🧰 Tech Stack
🧱 Framework & Language
- Java

- Spring Boot

🗃️ Database & Persistence
- MongoDB

- Spring Data MongoDB

🔐 Authentication & Security
- Spring Security

- JWT

- OAuth2

- BCrypt

- CORS Protection

- Hibernate Validator

- Input Validation & Sanitization

- Rate Limiting

- Data Encryption

⚡ Caching & Messaging
- Redis

- Apache Kafka

📚 API Documentation
- Swagger

- OpenAPI

- pringdoc-openapi-ui

🛠️ Developer Tools
- Lombok

- Spring Boot DevTools

🧪 Testing
- JUnit 5

- Mockito

- Spring Boot Test

✅ Code Quality
- SonarQube

⚙️ Build & Configuration
- Maven

- application.properties / application.yml

📄 Logging & Monitoring
- SLF4J

- Logback

⚙️ Installation
- Clone the repository:
```bash
  git clone https://github.com/fierce-adventurer/Journal-Application-backend.git

  cd Journal-Application-backend
```

- Set up environment variables:
  
  `cp .env.example .env`
  
  Edit `.env` with your configuration
  

- Install dependencies:
  
  `mvn install`

- Start the server:
  
  `mvn spring-boot:run`

📘 API Endpoints `localhost:8080`

📓 Journal Endpoints

- `POST /journal` – Add a new journal entry

- `GET /journal` – Get all journal entries for the authenticated user

- `GET /journal/id/{id}` – Get a specific journal entry by ID

- `DELETE /journal/id/{id}` – Delete a journal entry by ID

- `Optional: PUT /journal/id/{id}` – Update a journal entry (if implemented)

👤 User Endpoints

- `GET /user/greeting` – Authenticated greeting (basic auth)

🌐 Public Endpoints

- `GET /public/health-check` – Health check endpoint

- `POST /public/create-user` – Register a new user

- `POST /public/login` – Login user

👮 Admin Endpoints

- `GET /admin/getallusers` – Get all users

- `GET /admin/add-admin` – Add a new admin

🧪 Testing

- Run Tests
  
  `mvn test`

- Run Tests with Coverage
  
  `mvn test jacoco:report`

🔎 API Testing with Swagger

- Access Swagger UI:
  
  `http://localhost:8080/swagger-ui.html`

Steps
1.Register a user with `POST /api/auth/signup:`

```
json

{
  "username": "testuser",
  "email": "test@example.com",
  "password": "securepassword123"
}
```
2. Log in with `POST /api/auth/login:`
```
json

{
  "email": "test@example.com",
  "password": "securepassword123"
}
```
3. Click the `Authorize` button and input:
   
`Bearer your-jwt-token`

5. Test endpoints:

- `POST /journal`

- `GET /journal`

- `GET /journal/id/{id}`

- `DELETE /journal/id/{id}`

```
- id – Primary key

- username – Unique

- email – Unique

- password_hash – Hashed

- created_at

- updated_at
```

- Journal Entries Collection
```
- id – Primary key

- user_id – Foreign key

- title

- content

- tags – Array

- mood – Optional

- created_at

- updated_at
```

🛡️ Security Features
- BCrypt password hashing

- JWT authentication

- OAuth2 login support

- Input validation and sanitation

- CORS configuration

- Rate limiting

- Encrypted sensitive data

🤝 Contributing
- Fork the repository

- Create a feature branch:
`git checkout -b feature/your-feature`

- Commit your changes:
`git commit -m "Add your feature"`

- Push to GitHub:
`git push origin feature/your-feature`

- Open a Pull Request
