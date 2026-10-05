# CLGOPJP162

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Static Method

In Java, a static method is a method that belongs to the class rather than to any specific instance of the class. You can call a static method on the class itself, without creating an instance of the class. Static methods are commonly used for utility functions or operations that do not depend on the state of any particular object.

In this example:

- square and factorial are static methods defined in the MathUtils class.
- You can call these methods using the class name MathUtils followed by the method name without creating an instance of MathUtils.
- The square method calculates the square of an integer.
- The factorial method calculates the factorial of an integer using recursion.

Static methods are handy for creating utility classes or for operations that don't require access to instance-specific data. They are also used frequently in Java's standard libraries.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:15:02.769Z  

```java
class MathUtils {
    // A static method to calculate the square of an integer
    public static int square(int num) {
        return num * num;
    }
    
    // Another static method to calculate the factorial of an integer
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

class Codechef {
    public static void main(String[] args) {
        // Call the static methods directly using the class name
        int squaredValue = MathUtils.square(5);
        System.out.println("Square of 5 is: " + squaredValue);

        int factorialValue = MathUtils.factorial(5);
        System.out.println("Factorial of 5 is: " + factorialValue);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP162)