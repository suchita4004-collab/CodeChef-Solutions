# CLGOPJP158

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Coding Problem

You are given a Student class having name and age as attributes and a display method. This class also has a parameterized constructor having name and age as parameters to initialize the value of name and age of student respectively.
Given name and age as input, Create a student class, initialize the values and then print the information of Student using display method.

### Input Format
- First line contain a string representing name of the student.
- Second line contain a integer representing age of the student.
### Output Format

Print the information of the student using display method.

### Sample 1:
Input
Output

```
Alice 
12
```

```
Alice 
12
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:09:52.601Z  

```java
import java.util.Scanner;

class Student {
    public String name ;
    public int age ;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int age = scanner.nextInt();

        Student obj = new Student(name, age);
        obj.display();

        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP158)