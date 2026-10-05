# GARBASECJA06

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice Problem - Employee Object and GC

In Java, an object becomes eligible for Garbage Collection when it is no longer reachable through any reference.

In this problem, you will create an `Employee` object using the employee name and salary provided as input. Then, you will replace the reference with a new `Employee` object.

When the reference is reassigned, the first `Employee` object becomes eligible for Garbage Collection.

Complete the given program to:

- Read the names and salaries of two employees.
- Create an Employee object using the first employee's details.
- Print the first employee's details.
- Reassign the same reference to a new Employee object using the second employee's details.
- Print the second employee's details.
- Request Garbage Collection using System.gc().
- Print a confirmation message.

 **Input Format** 

 **Output Format** 

### Input Format

The first line contains the name of the first employee.

The second line contains the salary of the first employee.

The third line contains the name of the second employee.

The fourth line contains the salary of the second employee.

### Output Format

Print the first employee's details in the following format:

```
Employee: <name>, Salary: <salary>

```

Print the second employee's details in the same format.

Finally, print:

Garbage Collection requested

### Sample 1:
Input
Output

```
Rahul
50000
Priya
65000
```

```
Employee: Rahul, Salary: 50000
Employee: Priya, Salary: 65000
Garbage Collection requested
```

### Sample 2:
Input
Output

```
Amit
45000
Neha
70000
```

```
Employee: Amit, Salary: 45000
Employee: Neha, Salary: 70000
Garbage Collection requested
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:57:59.945Z  

```java
import java.util.Scanner;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.nextLine();
        int firstSalary = sc.nextInt();
        sc.nextLine();

        String secondName = sc.nextLine();
        int secondSalary = sc.nextInt();

        Employee employee = new Employee(firstName, firstSalary );

        System.out.println("Employee: " + employee.name + ", Salary: " + employee.salary);

        employee = new Employee(secondName,secondSalary);

        System.out.println("Employee: " + employee.name + ", Salary: " + employee.salary);

        System.gc();

        System.out.println("Garbage Collection requested");

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GARBASECJA06)