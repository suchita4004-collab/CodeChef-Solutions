# CLGOPJP168

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Circle Class

You are given a class Circle having radius as attributes, constructors and a getArea function which return the area of the circle.

### Task

Create two circles c1 and c2. c1 is created using the default constructor, which initializes its radius to 1.0. c2 is created using the constructor with one parameter, which initializes its radius to 5.0. The getArea() function is used to calculate the area of each circle.

Debug the code to ensure everything works fine.

### Output Format
- Print the area of c1 at first line.
- Print the area of c2 at second line.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:17:23.397Z  

```java
class Circle{
    private double radius;

    // Default constructor
    public Circle() {
        radius = 1.0;
    }

    // Constructor with one parameter
    public Circle(double radius) {
        this.radius = radius;
    }

    // Calculate the area of the circle
    public double getArea() {
        return 3.14159 * radius * radius;
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create a circle using the default constructor
        Circle c1 = new Circle();
        System.out.println("The area of circle c1 is " + c1.getArea());

        // Create a circle using the constructor with one parameter
        Circle c2 = new Circle(5.0);
        System.out.println("The area of circle c2 is " + c2.getArea());
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP168)