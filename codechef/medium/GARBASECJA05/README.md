# GARBASECJA05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice Problem - Create and Replace an Object

In Java, an object becomes eligible for Garbage Collection when it is no longer reachable through any reference.

In this problem, you will create a `Book` object using a book title provided as input. Then, you will create another `Book` object using a second title and assign it to the same reference variable.

When the reference is reassigned, the first `Book` object becomes eligible for Garbage Collection.

Complete the given program to:

- Read two book titles from the input.
- Create a Book object using the first title.
- Print the first book title.
- Reassign the same reference to a new Book object using the second title.
- Print the second book title.
- Request Garbage Collection using System.gc().
- Print a confirmation message.
### Input Format

The input contains two lines.

- The first line contains the title of the first book.
- The second line contains the title of the second book.
### Output Format

Print the first book title in the following format:

```
Book: <first title>

```

Finally, print:

Garbage Collection requested

### Sample 1:
Input
Output

```
Java Basics
Advanced Java
```

```
Book: Java Basics
Book: Advanced Java
Garbage Collection requested
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:48:53.187Z  

```java
import java.util.Scanner;

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstTitle = sc.nextLine();
        String secondTitle = sc.nextLine();

        Book book = new Book(firstTitle);

        System.out.println("Book: " + book.title);

        book = null;

        System.gc();
        
        book =new Book(secondTitle);
        System.out.println("Book: " + book.title);


        System.out.println("Garbage Collection requested");

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GARBASECJA05)