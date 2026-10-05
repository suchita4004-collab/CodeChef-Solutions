# GARBASECJA03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Understanding Garbage Collection

Garbage Collection (GC) is Java's automatic memory-management process. It identifies objects that are no longer reachable and reclaims the memory used by those objects.

Let's understand how an object becomes eligible for Garbage Collection using a simple Java program.

 **Let's Understand the Example** 

The code for this example is already provided in the IDE.

Run the code and observe the output.

 **Expected Output** 

```
Garbage Collection requested

```

 **How Does the Code Work?** 

 **Step 1: Create an Object** 

- A Student object is created using the new keyword.
- The reference variable s1 points to this object.

```
Student s1 = new Student("Rahul");

```

The object is stored in the Heap, while s1 holds its reference.

 **Step 2: Remove the Reference** 

```
s1 = null;

```

- Now, s1 no longer points to the Student object.
- Since there is no reference pointing to the object, it becomes unreachable and is eligible for Garbage Collection.

 **Step 3: Request Garbage Collection** 

```
System.gc();

```

- This requests the JVM to perform Garbage Collection.
- However, System.gc() does not guarantee that Garbage Collection will happen immediately. The JVM decides when to actually run the Garbage Collector.

 **Step 4: Print the Message** 
The program prints:

```
System.out.println("Garbage Collection requested");

```

This displays the message confirming that a Garbage Collection request was made.

 **Key Takeaway** 

The important sequence to remember is:

```
Create Object → Remove Reference → Object Becomes Unreachable → Eligible for GC → Request GC

```

Garbage Collection is automatic, and the JVM is responsible for deciding when the memory should actually be reclaimed.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:17:45.024Z  

```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Rahul");

        s1 = null; // Object becomes eligible for Garbage Collection

        System.gc(); // Request Garbage Collection

        System.out.println("Garbage Collection requested");
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GARBASECJA03)