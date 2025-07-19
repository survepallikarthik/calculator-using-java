# calculator-using-java
# Java Console Calculator 🧮

A simple Java console-based calculator that performs basic arithmetic operations. This project helps beginners understand the use of loops, conditional statements, exception handling, and methods in Java.

---

## 📌 Features

- Addition (`+`)
- Subtraction (`-`)
- Multiplication (`*`)
- Division (`/`) with zero-division error handling
- Input validation for numbers and operations
- Option to perform multiple calculations

---

## 💻 How to Run

### 1. compile the code

```bash
javac Calculator.java

### 2. run the code
     java Calculator

Sample Output

Welcome to the Java Calculator!
Enter a number:
> 10
Enter the operation (+, -, *, /):
> *
Enter a number:
> 5
Result is 50.0
Do you want to perform another calculation? (yes/no)
> no
Thank you for visiting our calculator!





## 🛠️ Concepts Used

This project demonstrates the following core Java concepts:

- **Scanner class**  
  Used to take input from the user (numbers and operations).

- **Methods**  
  Used to divide the program into reusable blocks like `getNumber()`, `getOperation()`, etc.

- **Exception Handling (`try-catch`)**  
  To handle invalid inputs gracefully when the user enters a non-numeric value.

- **Switch Case**  
  To perform the operation (`+`, `-`, `*`, `/`) based on user input.

- **Loops (`while`)**  
  To repeatedly prompt the user until valid input is given and allow multiple calculations.

- **Conditionals (`if-else`)**  
  Used for decision-making, such as checking for division by zero or confirming whether the user wants to continue.

- **Boolean Control Flag**  
  A `boolean` variable is used to control whether to continue or exit the calculator.

- **Basic Input Validation**  
  To ensure correct operation and prevent runtime crashes due to invalid data.

