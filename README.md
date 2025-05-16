# 🛒 Bazario - Developer-Centric E-Commerce Backend

Bazario is a robust, modular, and scalable e-commerce backend built using **Spring Boot**. It includes essential features for managing users, products, orders, addresses, and payments — with JWT-based authentication and RESTful APIs. Ideal for developers looking to extend, integrate, or deploy a full-fledged e-commerce solution.

---

## 🚧 Project Scope

* **Backend-only API** — Ready to integrate with any frontend (React, Angular, mobile apps).
* Focused on **clean architecture**, **separation of concerns**, and **security best practices**.
* Includes ready-to-test Postman collection.

---

## 🧩 Features

### 🔐 Authentication & User Management

* JWT-based secure login & registration
* Role-based access control (user, admin)
* Profile & address CRUD operations

### 🛍️ Product Lifecycle

* Admin APIs for add/update/delete
* Public product search (name, category, etc.)
* Product metadata: description, image URL, price

### 📦 Orders & Payments

* Place orders, manage cart & checkout
* Order status updates & tracking
* Payment gateway integration placeholders

### 🧾 Address Handling

* Attach multiple addresses to user accounts
* Link addresses to orders

### 🛠️ Admin Module

* Full CRUD on users, products, orders
* Basic analytics endpoints for sales & trends

---

## 🔧 Tech Stack

* **Java** 17+
* **Spring Boot** (REST APIs)
* **Spring Security** (JWT auth)
* **Spring Data JPA** + **MySQL**
* **Maven** (build tool)
* **Postman** (API testing)

---

## 📁 Directory Structure

```
bazario/
├── src/main/java/com/bazario/bazariobackend/
│   ├── config/           # App config
│   ├── controller/       # REST API controllers
│   ├── exceptions/       # Custom exception handling
│   ├── model/            # Entity classes
│   ├── payload/          # DTOs and request/response models
│   ├── repositories/     # JPA repositories
│   ├── security/         # Security & JWT logic 
│   ├── service/          # Business logic
│   ├── util/             # Utility classes
│   └── SbEcommerceApplication.java
├── src/main/resources/
│   └── application.properties
├── postman/              # API collection
│   └── ecom_api_collection.json
├── pom.xml               # Maven config
└── README.md
```

---

## ⚙️ Setup Instructions

### Prerequisites

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

### 3. Configure `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bazario
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
```

### 4. Build & Run

```bash
mvn clean install
mvn spring-boot:run
```

---

## 📬 API Testing

* Import the Postman collection from `postman/ecom_api_collection.json`
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
