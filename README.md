# BankAccountDemo

A simple, clean Java application demonstrating the core concepts of **Encapsulation** and **Data Hiding** in Object-Oriented Programming (OOP). 

---

## 🚀 Overview

The `BankAccountDemo` project showcases how to secure sensitive object data (like account numbers and balances) from direct external modification. By declaring attributes as `private` and exposing controlled `public` getter and setter methods, the application enforces business logic and structural integrity.

### Key OOP Concepts Demonstrated:
* **Data Hiding:** Restricting direct access to an object's internal components using `private` access modifiers.
* **Encapsulation:** Binding the data (variables) and the code acting on that data (methods) together as a single unit.
* **Data Validation:** Using setter methods to ensure illegal operations—such as setting a negative balance—are blocked.

---

## 🛠️ Features

* **Secure Attributes:** Account details cannot be arbitrarily altered from outside the class.
* **Validation Logic:** Built-in safeguards reject invalid inputs (e.g., negative balance adjustments).
* **Clean API:** Straightforward public methods for reading and securely updating account states.

---

## 💻 Code Structure

The repository contains:
* `BankAccountDemo.java`: The main entry point and class definition holding the encapsulation logic.

### Quick Logic Preview
```java
// Prevents the account balance from dropping below zero
public void setBalance(double balance) {
    if (balance >= 0) {
        this.balance = balance;
    } else {
        System.out.println("Error: Balance cannot be negative.");
    }
}
