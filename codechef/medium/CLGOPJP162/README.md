# CLGOPJP162

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:14:52.975Z  

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

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP162)