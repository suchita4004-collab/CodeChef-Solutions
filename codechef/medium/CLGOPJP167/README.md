# CLGOPJP167

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### User Defined vs Default Constructor

What happens if you provide a class with a user-defined constructor but do not provide a default constructor, and you attempt to create an object without arguments?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:16:05.987Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP167)