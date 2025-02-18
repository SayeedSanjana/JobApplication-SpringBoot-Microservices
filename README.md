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
   git clone https://github.com/SayeedSanjana/JobApplication-SpringBoot-Microservices.git
2. Navigate the project directorycd:
    ```sh
   cd jobapp
3. Build and run the application:
    ```sh
    ./mvnw spring-boot:run
4. The api will be available at: http://localhost:8080

## Additional Features & Learning Goals

- **Master Spring Boot fundamentals** to create robust REST APIs efficiently.
- **Seamlessly transition** from monolithic to microservices architecture.
- **Dockerize Spring Boot applications** and manage multi-container setups.
- **Deploy and orchestrate scalable microservices** using Kubernetes.
- **Implement inter-service communication** with RestTemplate and OpenFeign.
- **Integrate and configure PostgreSQL databases** using Docker.
- **Secure applications** using Spring Boot Actuator, Config Server, and Resilience4J.
- **Monitor and trace microservices** with Zipkin and Micrometer.
- **Utilize Eureka** for effective service registry and discoverability.
- **Apply fault tolerance, circuit breaking, and rate limiting** with Resilience4J.
