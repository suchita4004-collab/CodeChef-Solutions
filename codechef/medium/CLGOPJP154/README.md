# CLGOPJP154

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Object Reference Sharing

Consider the following Java code:

```
class Counter {
    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter(5);
        Counter c2 = c1;
        
        c1.increment();
        
        System.out.println(c2.getCount());
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T15:57:19.021Z  

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

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP154)