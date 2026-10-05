# GARBASECJA04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice - Make an Object Eligible for GC

Garbage Collection in Java automatically reclaims memory occupied by objects that are no longer reachable.

In this problem, you will create a `Student` object, remove its reference, and request Garbage Collection.

 **Complete the given program so that it:** 

- Creates a Student object using the given student name.
- Prints the student's name.
- Removes the reference to the Student object so that it becomes eligible for Garbage Collection.
- Requests Garbage Collection using System.gc().
- Prints a message confirming that Garbage Collection was requested.
### Input Format

The first line contains an integer `T`, representing the number of test cases.

For each test case, the next line contains the name of a student.

### Output Format

For each test case, print:

Student: Garbage Collection requested

### Sample 1:
Input
Output

```
2
Rahul
Priya
```

```
Student: Rahul
Garbage Collection requested
Student: Priya
Garbage Collection requested
```

### Explanation:

For each student:

A Student object is created using the given name. The student's name is printed. The reference to the object is removed by assigning null. The object becomes unreachable and is therefore eligible for Garbage Collection. System.gc() is used to request Garbage Collection. The program prints Garbage Collection requested.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:41:28.480Z  

```java
import java.util.Scanner;
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        for(int i=0;i < T; i++){
            
            String name= sc.nextLine();
            Student student = new Student(name);
        
        System.out.println("Student: " + student.name);

        student = null;

        System.gc();

        System.out.println("Garbage Collection requested");
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GARBASECJA04)