# telecom-billing-system
A RESTful Telecom Billing System built with Spring Boot, Spring Data JPA, and H2 Database. The application manages customers and generates bills based on telecom usage such as calls, SMS, and data.
Telecom Billing System (Spring Boot)

A RESTful backend application built using Spring Boot that simulates a
telecom billing system. The system manages customers, tracks telecom
usage (calls, SMS, data), and automatically generates bills.

  --------------------------------------------------
  Features
  --------------------------------------------------
  - Create and manage telecom customers - Generate
  bills based on call minutes, SMS usage, and data
  usage - RESTful API endpoints for billing
  operations - In-memory database using H2 - API
  testing using Postman - Layered architecture
  (Controller → Service → Repository)

  --------------------------------------------------

Tech Stack

Java Spring Boot Spring Data JPA Hibernate H2 Database Maven Postman
IntelliJ IDEA

  -------------------
  Project Structure
  -------------------

telecom-billing-system │ ├── controller │ └── BillingController.java │
├── service │ ├── BillingService.java │ └── CustomerService.java │ ├──
repository │ ├── BillingRepository.java │ ├── CustomerRepository.java │
└── PlanRepository.java │ ├── entity │ ├── Billing.java │ ├──
Customer.java │ └── Plan.java │ └── TelecomBillingSystemApplication.java

  ----------------------
  Installation & Setup
  ----------------------

1.  Clone Repository

git clone https://github.com/yourusername/telecom-billing-system.git

2.  Open in IDE

Open the project in IntelliJ IDEA.

3.  Install Dependencies

Maven will automatically download dependencies.

4.  Run Application

Run TelecomBillingSystemApplication.java

Server starts at: http://localhost:8080

  ---------------
  API Endpoints
  ---------------

Add Customer

POST http://localhost:8080/api/customers

Body:

{ “name”: “Darshan”, “phoneNumber”: “9876543210”, “address”: “Pune” }

------------------------------------------------------------------------

Generate Bill

POST http://localhost:8080/api/billing/{customerId}

Example:
http://localhost:8080/api/billing/1?callMinutes=100&smsCount=20&dataUsed=2

  ---------------------
  H2 Database Console
  ---------------------

Open: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:telecomdb User: sa Password: (empty)

  --------------------------
  Example Bill Calculation
  --------------------------

Calls : ₹1/min SMS : ₹0.5/SMS Data : ₹2/GB

  --------
  Author
  --------

Darshan Mengawade
