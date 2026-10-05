# CLGOPJP156

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Rectangle Class

Write a class Rectangle with length and breadth as attribute and area and perimeter as methods. Given length and breadth as input, Print area and perimeter of rectangle using area and perimeter methods respectively.

### Input Format
- The first line of input contains length of rectangle.
- The second line of input contains breadth of rectangle.
### Output Format
- First line contains the output of area method of Rectangle.
- Second line contains the output of perimeter method of Rectangle.
### Sample 1:
Input
Output

```
2 
3
```

```
6
10
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:05:49.423Z  

```java
import java.util.Scanner;

class Rectangle {
    public int length;
    public int breadth;

    public void area() {
        System.out.println(length * breadth);
    }

    public void perimeter() {
        System.out.println(2 * (length + breadth));
    }
}

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle r = new Rectangle();

        r.length = scanner.nextInt();
        r.breadth = scanner.nextInt();

        r.area();
        r.perimeter();
        
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP156)