# CLGOPJP148

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Create Student Class

You are given a class Student having attributes as name and age and a display method to print name and age of Student. Create a object of student class with given name and age. Use display method to print information of the Student.

### Input Format

The first line of input will contain a string and integer representing name and age respectively.

### Output Format

Use display method to print the name and age of Student.

### Sample 1:
Input
Output

```
Alice 45
```

```
Alice 45
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T15:36:55.167Z  

```java
import java.util.Scanner;

class Student {
    public String name;
    public int age;

    public void display() {
        System.out.println(name + " " + age);
    }
}

class Codechef {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner scanner = new Scanner(System.in);

        s.name = scanner.next();
        s.age = scanner.nextInt();

        s.display();

        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP148)