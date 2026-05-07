# Rewards Program API

## Overview

This project is developed using Spring Boot to calculate customer reward points based on transaction history.

The application calculates:

- Monthly reward points
- Total reward points

for each customer.

---

## Reward Calculation Rules

- 2 points for every dollar spent above $100
- 1 point for every dollar spent between $50 and $100

Example:

Transaction Amount = $120

- Above 100 → 20 × 2 = 40
- Between 50 and 100 → 50 × 1 = 50

Total = 90 points

---

## Technologies Used

- Java 17
- Spring Boot 3
- Gradle
- JUnit 5
- Mockito
- Lombok

---

## Project Structure

src/main/java

- controller
- service
- repository
- dto
- entity
- util
- exception

src/test/java

- unit tests
- integration tests

---

## API Endpoint

GET /api/rewards

---

## Features

- Reward point calculation
- Monthly aggregation
- Total reward calculation
- REST API
- Unit testing
- Integration testing
- Exception handling
- JavaDocs
- Clean architecture

---

## Run Application

./gradlew bootRun

---

## Run Tests

./gradlew test
