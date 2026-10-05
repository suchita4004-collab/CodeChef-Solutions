# CLGOPJP150

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### How to deal with Private Data Member

In Java, getter and setter methods are used to access and modify private data members (fields) of a class. Here's how you can create getter and setter methods for private data members:

- Getter Method: A getter method allows you to retrieve the value of a private field.
- Setter Method: A setter method allows you to modify the value of a private field.
- Using Getter and Setter: You can use the getter and setter methods to access and modify the private field.

In this example, the `setMyField` method sets the value of `myField`, and the `getMyField` method retrieves the value. Getter and setter methods provide controlled access to private fields.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T15:37:36.893Z  

```java
class MyClass {
    private int myField;

    // Getter method for myField
    public int getMyField() {
        return myField;
    }

    // Setter method for myField
    public void setMyField(int value) {
        myField = value;
    }
}

class Codechef {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Using the setter method to set the value of myField
        obj.setMyField(42);

        // Using the getter method to retrieve the value of myField
        int value = obj.getMyField();
        System.out.println("Value of myField: " + value);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP150)