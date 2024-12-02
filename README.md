# Starter Project with Docker and Docker Compose

This is a starter scaffolding for developing applications with Docker and Docker Compose. 
It includes a basic setup for running services and a ping endpoint to verify that everything is working correctly.

---

## 🛠️ Features

- **Docker**: Simplifies application setup and deployment.
- **Docker Compose**: Easy orchestration of services, this is with the service for the app and his database.
- **Ping Route**: A simple endpoint to confirm the service is up and running.
- **DataBase**: By default, is using H2 DataBase.

---

## 📦 Requirements

- [Docker](https://www.docker.com/get-started) (Recommended: version 20.10 or higher)
- [Docker Compose](https://docs.docker.com/compose/) (Recommended: version 1.29 or higher)

---

## 🚀 Setup and Usage

1. **Clone this repository:**

   ```bash
   Clone de repository
   before run the app or docker
   in the git bash in the folder run: "mvn clean package"

2. **Run the app:**

   ```bash
   You can start the app and test the ping

3. **Run docker:**

   ```bash
   By default, is using H2 DataBase
   In git bash in the folder
   First create image: "docker build -t app ."
   where "app" is the name of the image
   Then run the container: "docker run -p 8080:8080 app"
    
4. **Stop docker:**

   ```bash
   "docker stop app"
   
5. **Run docker-compose:**

   ```bash
   Comment the H2 settings in application.properties
   In git bash in the folder: "mvn clean package"
   To create image and run container: "docker-compose up --build"

6. **Stop docker-compose:**

   ```bash
   "docker-compose down -v"

7. **Delete Images, Containers & Networks:**

   ```bash
   "docker system prune -a"
   
8. **Open in swagger:**
   http://localhost:8080/swagger-ui.html
    ```bash
   if you open the swagger, you can test if works with the ping controller
