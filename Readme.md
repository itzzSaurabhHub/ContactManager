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

## Built With

- [Spring Boot](https://spring.io/projects/spring-boot) - The web framework used
- [Maven](https://maven.apache.org/) - Dependency management
- [H2 Database](https://www.h2database.com/html/main.html) - In-memory database for development/testing
- [Lombok](https://projectlombok.org/) - Boilerplate code reduction

## Authors

- Your Name - [Kumar Saurabh Mishra](https://www.linkedin.com/in/saurabh751/)