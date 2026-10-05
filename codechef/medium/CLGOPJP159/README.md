# CLGOPJP159

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Copy Constructor

In Java, a copy constructor is a special constructor that is used to create a new object as a copy of an existing object of the same class. It's like making a copy of something you already have.

You can refer to code example that illustrates the concept in an easy-to-understand way:

- The Car class has two constructors: one to set the car's name and another called the copy constructor.
- The copy constructor is called when we create a new car object (copiedCar) and initialize it using an existing car object (originalCar).
- The copy constructor copies the car's name from the existing car to the new car, creating a new car that's a copy of the original one.
- In the main() function, we create an originalCar, display its name, and then create a copiedCar using the copy constructor and display its name.

 **Key points:** 

- The copy constructor is automatically called when an object is copied.
- You can define your own copy constructor to handle deep copying of resources.
## Task

Run the code to verify it works fine.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:10:05.994Z  

```java
class Car {
    public String carName;

    // Parameterized constructor
    public Car(String carName) {
        this.carName = carName;
    }

    // Copy constructor (constructor that takes an object of the same class)
    public Car(Car c) {
        this.carName = c.carName;
    }
}

class Codechef {
    public static void main(String[] args) {
        Car originalCar = new Car("Beat"); // Parameterized constructor called here
        System.out.println(originalCar.carName);

        Car copiedCar = new Car(originalCar); // Copy constructor called here
        System.out.println(copiedCar.carName);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP159)