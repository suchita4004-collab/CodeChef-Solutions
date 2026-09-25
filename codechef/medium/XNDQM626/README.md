# XNDQM626

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Tracking Monthly Expenses

In this exercise, we are working with a system to track monthly expenses. The goal is to initialize arrays for various expenses and print them to verify correct initialization and assignment.

```
expenses = 2000.50, 1500.75, 800.25, 1200.00, 500.00
newExpenses = 100.00, 150.00, 75.50

```

 **Expected Output:** 

```
Rent Expense: 2000.5
Grocery Expense: 1500.75
Internet Bill: 100.0
Gym Membership: 150.0

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:27:21.192Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Step 1: Declare and assign expenses for Rent, Groceries, Utilities, Travel, and Others
        // Since we are storing floating point values, take double as datatype
         double[] expenses = {
             2000.50,1500.75,800.25, 1200.00, 500.00
             
         };  // Rent, groceries, utilities, travel, others

        // Step 2: Print Rent and Grocery expenses
        System.out.println("Rent Expense: " 
        + expenses[0]);
        System.out.println("Grocery Expense: "
        + expenses[1]);

        // Step 3: Dynamic Initialization: Add expenses later
         // Since we are storing floating point values, take double as datatype
        double[] newExpenses = new double[3];  // Three new expenses to add

        // Step 4: Assign values to new expenses
        newExpenses[0] = 100.00;  // Internet bill
        newExpenses[1] = 150.00;  // Gym membership
        newExpenses[2] = 75.50;  // Subscriptions

        // Step 5: Print the new expenses
        System.out.println("Internet Bill: " + newExpenses[0]);
        System.out.println("Gym Membership: " + newExpenses[1]);
        System.out.println("Subscriptions:" + newExpenses[2]);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/XNDQM626)