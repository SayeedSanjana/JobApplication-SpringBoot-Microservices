# Job Application REST API

## Description
A **Java Spring Boot REST API** for managing job applications. This project includes CRUD operations for key entities such as **Company**, **Reviews**, and **Job**. It demonstrates how to build a scalable API with Spring Boot and Jakarta Persistence (JPA).

---

## Features
- CRUD operations for:
  - **Job**: Manage job postings.
  - **Company**: Manage company information.
  - **Reviews**: Manage reviews for companies and jobs.
- RESTful API structure
- Data persistence with **Jakarta Persistence (JPA)**
- Integration with **H2/MySQL/PostgreSQL** database (configurable)
- Exception handling and input validation

---

## Tech Stack
- **Java 17+**
- **Spring Boot 3.x**
- **Jakarta Persistence (JPA)**
- **Database**: H2 (in-memory) / MySQL / PostgreSQL
- **Build Tool**: Maven
- **Testing**: JUnit 5, Mockito
- **Postman** (for API testing)

---

## Prerequisites
- Java 17+
- Maven 3.8+
- Database (e.g., MySQL, PostgreSQL)

---

## Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/job-application-api.git
2. Navigate the project directorycd:
    ```sh
   cd job-application-api
3. Build and run the application:
    ```sh
    ./mvnw spring-boot:run
4. The api will be available at: http://localhost:8080
