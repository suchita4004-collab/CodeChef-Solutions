# CLGOPJP149

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Access Modifiers in Java

In Java, access modifiers are keywords used to control the visibility and accessibility of classes, methods, fields, and other members within a class. There are four main access modifiers in Java:

- public: Accessible from anywhere.
- private: Accessible only within the same class.
- protected: Accessible within the same class, subclasses(not necessarily in the same package), and other classes in the same package.
- Default (package-private): Accessible within the same package.
### Task

Which of the following is a valid reason for error in the given code ?

```
class Student {
    private int age;
}

class Codechef {
    public static void main(String[] args) {
        Student s = new Student();
        s.age = 10;
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T15:37:25.625Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP149)