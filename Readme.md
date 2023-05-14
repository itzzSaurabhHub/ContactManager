# Contact Manager

This is a simple RESTful API for managing contacts. Users can perform CRUD operations and search for contacts by first name, last name, or email. The API is secured using Spring Security and supports two roles: ADMIN and NORMAL.

## Getting Started

### Prerequisites

- JDK 8 or later
- Maven
- Your favorite IDE or text editor

### Installing

1. Clone the repository:

   ```sh
   git clone https://github.com/itzzSaurabhHub/ContactManager.git
   ```

2. Build the project:

   ```sh
   cd contact-manager
   mvn clean install
   ```

### Running the Application

1. Run the following command to start the application:

   ```sh
   mvn spring-boot:run
   ```
### Security

- All endpoints require authentication.
- The following users are available:
  - ADMIN username: ADMIN, password: itzAdmin
  - NORMAL username: User, password: itzUser
  
### Documentation

- Wrote a README file to provide clear instructions on how to install, use, and contribute to the project.
- Created Swagger API documentation for the project. You can access the documentation at [http://localhost:8888/swagger-ui/index.html](http://localhost:8888/swagger-ui/index.html) after starting the application. The Swagger documentation provides a detailed overview of all the endpoints in the API, along with sample request and response payloads.

## Built With

- [Spring Boot](https://spring.io/projects/spring-boot) - The web framework used
- [Maven](https://maven.apache.org/) - Dependency management
- [H2 Database](https://www.h2database.com/html/main.html) - In-memory database for development/testing
- [Lombok](https://projectlombok.org/) - Boilerplate code reduction

### Entity Classes

- Created `Contact` entity class with `firstName`, `lastName`, `email`, `phoneNumber`

### DTO Classes

- Created separate `ContactRequest` and `ContactResponse` classes to map entities to DTOs

### Repository Interface

- Created `ContactRepository` interface that extends `JpaRepository<Contact, Long>`

### Controller Class

- Created `ContactController` class with the following endpoints:
  - `GET /contact`: retrieves a list of all contacts
  - `GET /contact/{id}`: retrieves a list of contact with id
  - `GET /contact/firstName/{firstName}`: retrieves a list of contact with firstName
  - `GET /contact/lastName/{lastName}`: retrieves a list of contact with lastName
  - `GET /contact/email/{email}`: retrieves a list of contact with email
  - `DELETE /contact/{id}`: Deletes the Contact with Id
  - `PUT /contact/{id}`: Updates the Contact which matches with Id
  - `POST /contact/`: creates a new contact.

## Authors

- Your Name - [Kumar Saurabh Mishra](https://www.linkedin.com/in/saurabh751/)