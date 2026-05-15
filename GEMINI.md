# Calculadora Spring Project

A simple Spring Boot REST API that provides basic arithmetic calculations.

## Project Overview

- **Main Technologies:**
  - **Framework:** Spring Boot 4.0.3
  - **Language:** Java 17
  - **Build Tool:** Maven
  - **Libraries:** Lombok (for boilerplate), JUnit 5 & Mockito (for testing)

- **Architecture:**
  - **Controllers:** `cl.usm.calculadoraspring.controllers` handles REST endpoints (e.g., `/calcular`).
  - **Services:** `cl.usm.calculadoraspring.services` contains the business logic for arithmetic operations.
  - **Entities:** `cl.usm.calculadoraspring.entities` defines data transfer objects like `CalculadoraRequest`.

## Building and Running

### Prerequisites
- JDK 17 or higher.

### Build the project
```bash
./mvnw clean compile
```

### Run the application
```bash
./mvnw spring-boot:run
```

### Run tests
```bash
./mvnw test
```

## Development Conventions

- **Lombok Usage:** Use `@Getter`, `@Setter`, `@NoArgsConstructor`, etc., to keep entity and DTO classes concise.
- **Service Layer:** All business logic (like division by zero checks) should reside in the service classes.
- **Error Handling:** The `CalculadoraController` handles exceptions and returns appropriate HTTP status codes (400 for bad input, 500 for internal errors).
- **Testing:** 
  - Aim for high test coverage in both services and controllers.
  - Use Mockito to mock service dependencies when testing controllers.

## Key Files

- `CalculadoraController.java`: Defines the `/calcular` POST endpoint.
- `CalculadoraService.java`: Implements the arithmetic logic (`+`, `-`, `*`, `/`).
- `CalculadoraRequest.java`: DTO for the calculator request body.
- `CalculadoraControllerTest.java`: Unit tests for the controller logic.
