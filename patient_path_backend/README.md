# Patient Path Backend

This is a Spring Boot backend for the Patient Path application, which manages users, doctors, appointments, and admin functionalities for a healthcare platform.

## Features

- User registration and authentication
- Admin registration and authentication
- Doctor management (CRUD operations)
- Appointment booking and management
- Email notifications for appointments and registration
- RESTful API endpoints for frontend integration

## Project Structure

- `src/main/java/capstone/project/paticentpath/`
  - `controller/` - REST controllers for API endpoints
  - `models/` - JPA entity classes
  - `repositorys/` - Spring Data JPA repositories
  - `services/` - Service interfaces
  - `services/impl/` - Service implementations
  - `exceptions/` - Custom exception classes

## Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+
- MySQL or compatible database

### Setup

1. **Clone the repository:**
   ```sh
   git clone <repository-url>
   cd patient_path_backend/patient_path_backend
   ```

2. **Configure the database:**
   - Update your `application.properties` with your database credentials.

3. **Build the project:**
   ```sh
   ./mvnw clean install
   ```

4. **Run the application:**
   ```sh
   ./mvnw spring-boot:run
   ```

### API Endpoints

- `/user` - User registration and login
- `/admin` - Admin registration and login
- `/doctor` - Doctor management
- `/bookappointment` - Appointment booking and management
- `/tests` - Test management

### Email Notifications

Emails are sent using Spring Boot's `JavaMailSender`. Update the sender email in [`SendEmailImpl`](src/main/java/capstone/project/paticentpath/services/impl/SendEmailImpl.java) as needed.

## Running Tests

```sh
./mvnw test
```

## License

This project is for educational purposes.

---

**Maintainers:**  
- [Aneesh Kudikala](aneesh.kudikala@gmail.com)