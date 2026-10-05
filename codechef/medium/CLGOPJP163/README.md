# CLGOPJP163

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Static Block

In Java, a static block is a block of code enclosed in curly braces `{}` and with `static` keyword. This block of code is executed when the class is loaded into memory, before any instances of the class are created or any static members are accessed.

In this example:

- We have a class named Codechef.
- Inside the class, there's a static variable staticVar and a static block enclosed in {}.
- The static block contains code to print a message and initialize the staticVar with the value 42.
- In the main method, we print the value of staticVar.
- Note that here static block is executed before the main function.

Key points about static blocks:

- Static blocks are executed only once when the class is loaded, regardless of how many instances of the class are created.
- They are often used for performing tasks such as initializing static variables, setting up static configurations, or loading resources that are shared among all instances of the class.
- Static blocks are executed in the order in which they appear in the class.
- They are particularly useful when you need to perform complex initialization that cannot be achieved in a single line or expression.

Static blocks are a convenient way to ensure that certain initialization tasks are completed before any other code in the class is executed.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:15:15.192Z  

```java
class Codechef {
    // A static variable
    static int staticVar;

    // A static block
    static {
        System.out.println("This is a static block.");
        staticVar = 42;
    }

    public static void main(String[] args) {
        System.out.println("Static variable: " + staticVar);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP163)