# CLGOPJP165

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:15:28.977Z  

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

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP165)