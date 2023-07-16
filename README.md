# SpringBoot Calculator
## This repository contains a Spring Boot application that serves as a calculator. It allows you to perform various calculations and view the stored operations and exceptions.

### Prerequisites
  * Git
  * Docker
  * Docker Compose

### Set Up
- clone the repo
git clone <repository_url>
- Navigate to the project directory:
cd springbootCalculator
- Start PostgreSQL using Docker Compose:
Copy code
docker-compose up -d
Run the application.

### Usage
Once the application is running, you can use the following routes:

* localhost:8080/index: Use this route to test calculations.
* localhost:8080/operations: Use this route to view the stored operations.
* localhost:8080/exceptions: Use this route to view all the occurred exceptions in the app.

### Testing
You can use the following tests to raise exceptions:

* Empty inputs
* Division by zero
* Non-numerical values as inputs
* Hitting invalid routes
Please note that these tests are meant to simulate exception scenarios and should be used for testing purposes only.
