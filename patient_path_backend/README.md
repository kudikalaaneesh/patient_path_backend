# 🏥 Patient Path Backend

This is the **Spring Boot** backend for the **Patient Path** healthcare platform. It provides RESTful APIs to manage **users**, **doctors**, **appointments**, and **administrative functionalities**, along with email notifications for appointments and registration events.

---

## 🚀 Features

- ✅ User & Admin **Registration** and **Authentication**
- 🩺 Doctor **CRUD Operations**
- 📅 Appointment **Booking and Management**
- 📧 Automated **Email Notifications**
- 🔐 Secure API endpoints with proper validation
- 🔄 Designed for **frontend integration** via REST APIs

---

## 📁 Project Structure

```
src/main/java/capstone/project/patientpath/
│
├── controller/         # REST Controllers
├── models/             # JPA Entity Models
├── repositorys/        # Spring Data JPA Repositories
├── services/           # Service Interfaces
├── services/impl/      # Service Implementations
└── exceptions/         # Custom Exception Handling
```

> 📝 Note: Folder name `repositorys` seems to be a typo. Consider renaming it to `repositories`.

---

## ⚙️ Getting Started

### ✅ Prerequisites

- Java 17 or higher
- Maven 3.6+
- MySQL or a compatible relational database

---

### 🔧 Setup Instructions

1. **Clone the Repository**

   ```bash
   git clone <repository-url>
   cd patient_path_backend/patient_path_backend
   ```

2. **Configure the Database**

   Update your `src/main/resources/application.properties` file with your MySQL database credentials:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/patient_path
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

3. **Build the Project**

   ```bash
   ./mvnw clean install
   ```

4. **Run the Application**

   ```bash
   ./mvnw spring-boot:run
   ```

---

## 📡 API Endpoints

| Resource          | Endpoint Base Path     | Description                          |
|------------------|------------------------|--------------------------------------|
| User             | `/user`                | User registration & login            |
| Admin            | `/admin`               | Admin registration & login           |
| Doctor           | `/doctor`              | Doctor CRUD operations               |
| Appointment      | `/bookappointment`     | Book, update, and manage appointments|
| Test Management  | `/tests`               | Add or retrieve medical tests        |

---

## 📬 Email Notifications

- Emails for registration confirmation and appointment alerts are sent using **Spring Boot’s JavaMailSender**.
- You can customize the sender email by editing the `SendEmailImpl` class:

  ```
  src/main/java/capstone/project/patientpath/services/impl/SendEmailImpl.java
  ```

> 💡 Ensure SMTP credentials and host configurations are set correctly in `application.properties`.

---

## 🧪 Running Tests

```bash
./mvnw test
```

Unit and integration tests are configured to ensure system reliability.

---

## 🪪 License

This project is intended for **educational purposes only**.  
All rights reserved by the authors and contributors.

---

## 👨‍🔧 Maintainers

- **Aneesh Kudikala**  
  📧 [aneesh.kudikala@gmail.com](mailto:aneesh.kudikala@gmail.com)

---
