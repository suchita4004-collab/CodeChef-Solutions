# JAVATC03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in

Let's create a simple division calculator that handles division by zero in Java We'll use a try-catch block to catch the error and provide a friendly message to the user.

 **Write a Java program that asks the user for two numbers and performs division. The program should handle the case where the user enters 0 as the second number, preventing a division error and displaying an appropriate message instead.** 

### Input Format
- The user will enter two numbers.
- The first number is the dividend.
- The second number is the divisor.
### Output Format
- If the second number is not zero, the program will display the result of the division.
- If the second number is zero, the program will display an error message instead of crashing.
### Sample 1:
Input
Output

```
10
2
```

```
5
```

### Sample 2:
Input
Output

```
15
0
```

```
Division not allowed.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T07:16:53.019Z  

```java
import java.util.Scanner;

class Codechef {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int a= sc.nextInt();
        int b= sc.nextInt();
        
        try{
            if (b == 0){
                throw new
                ArithmeticException();
                
            }   
            
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Division not allowed.");
        }
        sc.close();
        // Write your code here
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAVATC03)