# DUPSS Testing Project

## Overview

DUPSS Testing is an automated testing project for the DUPSS (Drug Use Prevention and Support System) web application. This project contains automated test scripts for validating core functionalities of the DUPSS platform, including user authentication (login), registration, and account management features.

## Project Structure

The project is organized as follows:

- **Test Cases**: Contains all test case definitions
  - `LoginFunction`: Test cases for login functionality
  - `RegistrationFunction`: Test cases for user registration
  - `ChangePasswordFunction`: Test cases for password change functionality

- **Scripts**: Contains the Groovy implementation of test cases
  - Matches the structure of the Test Cases directory

- **Object Repository**: Contains element locators for the web application
  - Page objects are organized by web page (login page, registration page, etc.)

- **Data Files**: Contains test data in DAT format for data-driven testing
  - `LoginDataTest.dat`
  - `RegistrationDataTest.dat`
  - `ChangePasswordDataTest.dat`

- **Test Suites**: Contains test suite configurations that group related test cases
  - `LoginTestSuite`
  - `RegistrationTestSuite`
  - `ChangePasswordFunction`

## Key Features

### Login Function Tests

Validates login functionality including:
- Successful login with valid credentials
- Failed login with invalid credentials
- Validation for empty fields

### Registration Function Tests

Validates user registration including:
- Successful registration with valid information
- Validation for required fields
- Handling of invalid inputs
- Test cases for specific scenarios (empty username, password requirements)

### Change Password Function Tests

Validates password change functionality including:
- Successful password change
- Validation for empty fields
- Password length requirements
- Current password verification

## Test Data Management

The project uses data-driven testing approach with:
- Excel files (`.xlsx`) as the source for test data
- Data files (`.dat`) generated for test execution

## How to Use This Project

### Prerequisites

- Katalon Studio installed
- Access to the DUPSS web application
- Valid test credentials

### Running Tests

1. **Open the Project**:
   - Launch Katalon Studio
   - Open the project from the location where it is stored

2. **Execute Individual Test Cases**:
   - Navigate to the Test Cases directory
   - Right-click on a test case and select "Run"

3. **Execute Test Suites**:
   - Navigate to the Test Suites directory
   - Right-click on a test suite and select "Run"
   - Results will be available in the Reports section

4. **Configure Test Execution**:
   - Use the Profiles section to configure environment-specific settings
   - Modify data files for data-driven testing

## Test Case Coverage

### Login Function
- Basic login with valid credentials
- Login with empty username and password
- Login with invalid credentials

### Registration Function
- Complete registration with valid data
- Registration with empty required fields
- Registration with invalid password confirmation

### Change Password Function
- Change password with valid inputs
- Change password with empty fields
- Change password with incorrect current password
- Change password with invalid new password (length requirements)

## Technologies

- **Katalon Studio**: Test automation framework
- **Groovy**: Scripting language for test implementation
- **Page Object Model**: Design pattern for organizing UI elements
- **Data-Driven Testing**: Approach for executing tests with multiple data sets

## Maintenance

When updating this project:
1. Ensure element locators in Object Repository are up-to-date
2. Update test data as needed
3. Follow the established naming conventions for new test cases
4. Update test suites to include new test cases 