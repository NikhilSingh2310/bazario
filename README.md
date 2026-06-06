# 🛒 Bazario — Production-Grade E-Commerce Backend
Bazario is a robust, scalable, and cloud-deployed e-commerce backend built using **Spring Boot**. Features JWT authentication, Redis caching, rate limiting, Docker containerization, and live deployment on Railway.

## 🚀 Live Demo
**Base URL:** https://bazario-production-cca5.up.railway.app

- Health: https://bazario-production-cca5.up.railway.app/actuator/health
- Products: https://bazario-production-cca5.up.railway.app/api/public/products

---

## 🚧 Project Scope
* **Backend-only API** — Ready to integrate with any frontend (React, Angular, mobile apps).
* Focused on **clean architecture**, **separation of concerns**, and **security best practices**.
* Includes ready-to-test Postman collection.
* **Production deployed** — Live on Railway with cloud MySQL and Redis.

---

## 🧩 Features

### 🔐 Authentication & Security
* JWT-based secure login & registration
* Role-based access control (Admin, Seller, User)
* Rate limiting — 100 requests/minute per IP (Bucket4j)
* Profile & address CRUD operations

### 🛍️ Product Lifecycle
* Admin APIs for add/update/delete
* Public product search (name, category, etc.)
* Pagination & sorting on all listing APIs
* Redis caching on product endpoints — TTL 10 minutes

### 📦 Orders & Cart
* Place orders, manage cart & checkout
* Order status updates & tracking
* Address management per user

### 🧾 Address Handling
* Attach multiple addresses to user accounts
* Link addresses to orders

### 🛠️ Admin Module
* Full CRUD on users, products, orders
* Role assignment and management

### 📊 Health Monitoring
* /actuator/health — MySQL + Redis + System health
* /actuator/info — App metadata

---

## 🔧 Tech Stack
* **Java 17+** + **Spring Boot 3.4**
* **Spring Security** — JWT + RBAC
* **Spring Data JPA** + **Hibernate** + **MySQL**
* **Redis** — Caching layer
* **Bucket4j** — Rate limiting
* **Docker + Docker Compose** — Containerization
* **Spring Boot Actuator** — Health monitoring
* **Railway** — Cloud deployment
* **Swagger** — API documentation
* **Maven** — Build tool
* **Postman** — API testing

---

## 📁 Directory Structure
```
bazario/
├── src/
│   ├── main/
│   │   ├── java/com/bazario/bazariobackend/
│   │   │   ├── config/           # Redis, Security, Rate Limiting
│   │   │   ├── controller/       # REST API controllers
│   │   │   ├── entity/           # Entity classes
│   │   │   ├── exceptions/       # Custom exception handling
│   │   │   ├── payload/          # DTOs and request/response models
│   │   │   ├── repository/       # JPA repositories
│   │   │   ├── security/         # Security & JWT logic
│   │   │   ├── service/          # Business logic + Caching
│   │   │   ├── util/             # Utility classes
│   │   │   └── BazarioBackendApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── BazarioBackendApplicationTests.java
├── postman/              # API collection
├── Dockerfile            # Container config
├── docker-compose.yml    # MySQL + Redis + App
├── mvnw                  # Maven wrapper
├── pom.xml               # Maven config
└── README.md
```


---

## ⚙️ Setup Instructions

### Option 1 — Docker (Recommended)

Prerequisites:
* Docker + Docker Compose

```bash
git clone https://github.com/NikhilSingh2310/bazario.git
cd bazario
./mvnw clean package -DskipTests
docker compose up --build
```

App runs at http://localhost:8080
MySQL at port 3306, Redis at port 6379

---

### Option 2 — Manual Setup

Prerequisites:
* Java 17+
* MySQL 8+
* Maven 3.8+

### 1. Clone and Navigate
```bash
git clone https://github.com/NikhilSingh2310/bazario.git
cd bazario
```

### 2. Create Database
```sql
CREATE DATABASE bazario;
```

### 3. Configure application.properties
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bazario
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.data.redis.host=localhost
spring.data.redis.port=6379
```

### 4. Build & Run
```bash
./mvnw clean package -DskipTests
./mvnw spring-boot:run
```

---
## 📬 API Testing

* Import the Postman collection from `postman/BazarioBackend APIs.postman_collection.json`
* Pre-configured with sample auth and data payloads

---

## 🧑‍💻 Contribution Guidelines

* Fork the repo and create a feature branch
* Follow existing code style and naming conventions
* Raise PRs with relevant context and testing notes

---

## 🌱 Future Scope

* **Integrated payment gateways** (e.g., Razorpay, Stripe, PayPal) with real-time transaction tracking.
* **A modern, responsive frontend** using React.js or Next.js to deliver a slick shopping experience.
* **Progressive Web App (PWA)** capabilities for mobile-friendliness.
* **Microservices support** for scalability.

---

## 👤 Author

**Nikhil Singh**
GitHub: [@NikhilSingh2310](https://github.com/NikhilSingh2310)

---

> Designed with scalability and developer productivity in mind. Plug and play into any frontend and extend for production use.
