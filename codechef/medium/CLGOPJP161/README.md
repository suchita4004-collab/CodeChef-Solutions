# CLGOPJP161

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Static Fields

Create a BankAccount class that simulates a simple bank account. The class should have the following features:

- A static data member totalBalance to keep track of the total balance across all accounts.
- A constructor that takes an initial balance as a parameter and updates totalBalance accordingly.

There are 2 BankAccounts in the Bank. Given the balance of both the accounts as input, create the object using constructor to update totalBalance and print totalBalance of Bank.

### Input Format

First line contain 2 integers representing the balances of bank accounts.

### Output Format

Print the value of totalBalance.

### Sample 1:
Input
Output

```
10 20
```

```
30
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:14:50.519Z  

```java
import java.util.Scanner;

class BankAccount {
    public static int totalBalance;
    

    public BankAccount(int balance) {
        totalBalance= totalBalance + balance;
    }
}


class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        BankAccount account1 = new BankAccount(amount);

        amount = scanner.nextInt();
        BankAccount account2 = new BankAccount(amount);

        System.out.println(BankAccount.totalBalance);

        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP161)