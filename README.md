# 🛒 E-Commerce Web Automation Framework

A robust, production-grade End-to-End UI Automation Testing suite developed for an e-commerce platform. This framework is built using the  Page Object Model (POM) design pattern to ensure high maintainability, scalability, and reusability of test scripts.



# 🛠️ Tech Stack & Architecture

* Language: Java
* Automation Tool: Selenium WebDriver (Chrome)
* Framework Pattern: Cucumber BDD (Behavior-Driven Development)
* Test Runner: TestNG
* Build Tool: Maven
* Reporting: Cucumber HTML Reports / Extent Reports



# 📋 Features & Scenarios Automated

The test suite thoroughly validates critical user journeys, covering both negative boundary cases and successful end-to-end purchasing flows.

# 1️⃣ Feature: Ecommerce Automation

# 🔴 Scenario: Login fails with invalid credentials
* Given I am on the landing page
* When User navigates to login page
* Then User enters invalid email and password
* Then User clicks on login button
* Then User sees error message

# 🟢 Scenario: Open landing page (End-to-End Purchase Flow)
* Given I am on the landing page
* When User navigates to login page
* Then User enters email and password
* Then User clicks on login button
* Then User validates login is success
* Then User performs validation on the home page
* When User clicks on products
* Then User performs the validation on product listing page
* Then User clicks on view product
* Then User performs validation on product description page
* Then User clicks on add to cart
* Then User validates the pop up
* When User clicks on view cart
* Then User performs validation on the cart page
* When User clicks on proceed to checkout
* Then User performs validation on checkout page
* When User clicks on place order button
* Then User enters the payment details
* Then User clicks on pay and confirm button
* Then User performs validation on the congratulations page

---

#🚀 Key Framework Highlights

* Behavior-Driven Development (BDD): Written in Gherkin syntax, making test cases easily readable for both technical and non-technical stakeholders.
* Page Object Model (POM): Separated page UI elements and actions from the actual test step definitions to reduce code duplication and ease maintenance.
* Robust Assertions: Integrated strict validations at every stage of the checkout funnel (Product price, cart counts, pop-ups, and order placement success messages).
* Data-Driven Readiness: Designed step definitions to dynamically accept various user credentials and payment profiles.

---

# 📦 How to Run the Tests Locally

1. Clone the repository:
```bash
   git clone [https://github.com/SahanRathnaweera/Ecommerce-Automation-Framework.git](https://github.com/SahanRathnaweera/Ecommerce-Automation-Framework.git)


