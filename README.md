# Java-Speaking-Clock-Task

## Overview
The Speaking Clock application is a Spring Boot-based REST API that converts a given time in 24-hour format into English words. It returns "It's Midnight" for 00:00 and "It's Midday" for 12:00. For other times, it provides the hour and minute in words (e.g., "It's eight thirty-four").

## Features
Convert time from 24-hour format to English words.
Handle special cases for midnight and midday.
RESTful API with Swagger documentation for easy testing.

## Technologies Used
Java 8, Spring Boot, Maven, Swagger, JUnit for testing

## Prerequisites
JDK 8 or above, Maven 3.0 or above

## Installation
1. Clone the Repository
Clone the repository to your local machine using the following command: https://github.com/AnuAradya07/Java-Speaking-Clock-Task.git

2. Navigate to the Project Directory
Change to the project directory: cd Java-Speaking-Clock-Task

4. Build the Project
Use Maven to clean and install the project: mvn clean install

4. Run the Application
Run the application using: mvn spring-boot:run

The application will start on http://localhost:8080.

## API Documentation
The API is documented using Swagger. Access the Swagger UI at: http://localhost:8080/swagger-ui.html

## API Endpoint
GET /api/time/{time}: Converts the provided time (in 24-hour format) to words.

Example Requests:
Request: /api/time/08:34
Response: It's eight thirty-four
Request: /api/time/00:00
Response: It's Midnight
Request: /api/time/12:00
Response: It's Midday

## Error Handling
If the time format is invalid, the API returns a 400 Bad Request with an error message.

Example:
Request: /api/time/25:00
Response: 400 Bad Request with message: Invalid Time Format

## Testing
Unit tests are written using JUnit. You can run the tests using: mvn test

## Author
Ananya R
