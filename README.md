📋 Registration Test Automation with Selenium and Cucumber


This repository contains a test automation project for the user registration functionality, using Selenium and Cucumber tools. The project follows the Page Object Model (POM) pattern to organize and manage the elements and actions on the page.

📜 Table of Contents
Features
Technologies Used
Project Structure
Prerequisites
How to Run
Contribution
License
Contact

✨ Features

Test Scenarios:
✅ Successful registration
❌ Registration with an existing email

🛠️ Technologies Used
Language: Java
Web Automation: Selenium WebDriver
BDD: Cucumber
Test Framework: JUnit
Design Pattern: Page Object Model (POM)

📂 Project Structure
 
├── features
│   └── cadastro.feature
├── src
│   └── main
│       └── java
│           ├── cucumber
│           │   ├── pages
│           │   │   └── SignUpPage.java
│           │   └── resources
│           │       └── StepDefinitions.java
│           └── BasePage.java
├── pom.xml
└── README.md

features/cadastro.feature: Contains the test scenarios in Gherkin language.
src/main/java/cucumber/pages/SignUpPage.java: Class representing the signup page, containing methods to interact with page elements.
src/main/java/cucumber/resources/StepDefinitions.java: Step definitions that map the test scenarios to Java code.
BasePage.java: Base class that contains WebDriver configuration.
pom.xml: Maven configuration file, containing project dependencies.

📝 Prerequisites
Java JDK 8 or higher
Maven
Google Chrome
ChromeDriver (Automatically managed by WebDriverManager)

🚀 How to Run

1. Clone this repository:
   git clone https://github.com/your-username/repository-name.git
2. Navigate to the project directory:
   cd repository-name
3. Install Maven dependencies:
   mvn install
4. Run the tests:
   mvn test

📜 License
This project is licensed under the MIT License. See the LICENSE file for more details.

📞 Contact
Name: Alan Almeida
Email: alanalmeidadev12@gmail.com
LinkedIn: [your-linkedin-profile](https://www.linkedin.com/in/alan-almeidadev/)


 
