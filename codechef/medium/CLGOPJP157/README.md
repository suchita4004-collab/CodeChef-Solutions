# CLGOPJP157

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Constructors in Java

Constructors in Java are special methods used to initialize objects when they are created. Constructors have the same name as the class and do not have a return type, not even `void`. They are called automatically when you create an instance (object) of a class using the `new` keyword. Here are some key points about constructors in Java:

- Default Constructor: If a class does not explicitly define any constructors, Java provides a default constructor with no arguments.
- Parameterized Constructors: You can define one or more constructors with parameters to initialize an object with specific values.

In this example:

- Person class has a default constructor and a parameterized constructor.
- main method demonstrates the creation of objects using both constructors.
- You can see that constructors are responsible for initializing object attributes, and you can create objects with different initial values using constructor overloading.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:06:03.705Z  

```java
class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Codechef {
    public static void main(String[] args) {
        // Creating objects using constructors
        Person person1 = new Person(); // Default constructor
        Person person2 = new Person("Alice", 30); // Parameterized constructor

        // Accessing object attributes
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP157)