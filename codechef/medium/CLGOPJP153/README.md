# CLGOPJP153

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Syntax to declare a class

What is the correct syntax to declare a public class named Car with a class body in Java?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T15:56:11.613Z  

```cpp
class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private int balance;

    // Constructor to initialize the attributes
    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0; // Initial balance is 0
    }

    // Deposit method
    public void deposit(int amount) {
        balance =  balance + amount;
        System.out.println("Deposited: $" + amount);
    }

    // Withdraw method
    public void withdraw(int amount) {
        balance = balance - amount  ;
        System.out.println("Withdrawn: $" + amount);
    }

    // Display account information
    public void getAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance); 
    }
}

public class Main {
    public static void main(String[] args) {
        
    BankAccount account = new BankAccount(12345, "John Doe");
     account.deposit(1000);
     account.withdraw(500);
     account.deposit(200);
     
     account.getAccountInfo();
        // Write your code here
        
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP153)