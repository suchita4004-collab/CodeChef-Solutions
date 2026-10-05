# CLGOPJP164

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Static Nested Classes

In Java, a static nested class is a class that is defined within another class, and it is marked as static. This means that you can access a static nested class without creating an instance of the outer class.

In this example, we have an `OuterClass` that contains a static nested class called `StaticNestedClass`. The `StaticNestedClass` has its own fields and methods, and you can create an instance of it without needing an instance of the `OuterClass`. You can also access the instance variables of the `OuterClass` from within the `StaticNestedClass` if needed.

To create an instance of the static nested class, you use the syntax:

```
OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();

```

Then, you can call methods or access fields of the nested class using `nestedObj`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:15:26.968Z  

```java
class OuterClass {
    // Static nested class
    public static class StaticNestedClass {
        
        // Static nested class can have its own fields and methods
        private int nestedField = 20;
        
        // Constructor for the static nested class
        public StaticNestedClass() {
            // Empty constructor
        }
        
        // Method in the static nested class
        public void display() {
            System.out.println("Value of nestedField: " + nestedField);
        }
    }
}


class Codechef {
    public static void main(String[] args) {
        // Create an instance of the static nested class
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        
        // Access the nested class's method and field
        nestedObj.display();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP164)