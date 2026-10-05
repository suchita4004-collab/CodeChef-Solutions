# CLGOPJP151

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Bank Account Class

This code demonstrates a basic implementation of a bank account system using object-oriented programming (OOP) principles in Java. Here's an explanation of the code:

- BankAccount Class: This class represents a bank account. It has three private attributes: accountNumber, accountHolder and balance The class includes a constructor to initialize the attributes when creating a new account.
- Deposit Method (deposit): This method allows you to deposit a specified amount into the account.
- Withdraw Method (withdraw): This method allows you to withdraw a specified amount from the account.
- Get Account Information Method (getAccountInfo): This method displays the account information, including the account number, account holder's name, and the current balance.
### Task

Create an instance of the `BankAccount` class named `account` with an initial account number = 12345 and account holder's name = `John Doe`. Perform deposit of 1000, withdrawal of 500 and deposit of 200. Finally, display the account information using the `getAccountInfo` method.

This code simulates a simple bank account system where you can create an account, deposit and withdraw funds, and view the account details.

### Sample 1:
Input
Output

```
 
```

```
Deposited: $1000
Withdrawn: $500
Deposited: $200
Account Number: 12345
Account Holder: John Doe
Balance: $700
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T15:55:14.589Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP151)