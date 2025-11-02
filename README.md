# Core Banking System (Swing) - Class Project

**Author:** MANISHIMWE Kwizera Jean Luc  
**Course:** JAVA PROGRAMMING 

**Project Type:** Class Assignment / Swing GUI Application  
**Repository:**(https://github.com/Jean-Luc-of-God/Core-Banking-System-with-swing-school-project/tree/main)  

---

## Overview

This project is a **Core Banking System** implemented in **Java Swing**. It was developed as part of a **class assignment**, where we initially learned 4 basic CRUD operations in class and were tasked to extend functionality as homework. The system demonstrates **object-oriented programming (OOP)** principles and uses **JDBC** for database operations with MySQL.

The application allows basic banking operations through a **Graphical User Interface (GUI)**:

- Register a new bank account
- Update existing account information
- Delete an account
- Search for an account
- (Additional operations can be added as extensions based on class instructions)

---

## Features Implemented

1. **Register Account**  
   - Enter account number, name, type, and initial amount.  
   - Saves the account in the MySQL database.  

2. **Update Account**  
   - Click **Update** → prompted to enter the account number → account details displayed in fields → update information → confirm changes → updates in database.  

3. **Delete Account**  
   - Click **Delete** → prompted to enter account number → account details displayed → confirm deletion → account removed from database.  

4. **Search Account**  
   - Click **Search** → enter account number → account details displayed in the GUI.

---

## Technologies Used

- **Java SE** (Swing GUI for desktop application)
- **JDBC** (Java Database Connectivity)
- **MySQL** (Database to store bank accounts)
- **NetBeans IDE and Intelli J** (Development environment)
- **Git & GitHub** (Version control and repository)

---

## Database Schema

**Table:** `bank_account`  

| Column Name      | Data Type | Description                  |
|-----------------|-----------|------------------------------|
| account_number   | VARCHAR   | Unique identifier for account |
| account_name     | VARCHAR   | Name of the account holder   |
| account_type     | VARCHAR   | Type of account (Savings/Checking) |
| account_amount   | DOUBLE    | Current account balance      |

---

## How to Run

1. Clone the repository:  
   ```bash
   git clone https://github.com/Jean-Luc-of-God/Core-Banking-System-with-swing-school-project.git
