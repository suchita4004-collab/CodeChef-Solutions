# LJAAS59

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a program to check whether the three given numbers as input are  **Positive, Negative, or Zero**.

### Sample 1:
Input
Output

```
20  
0  
-95
```

```
Positive  
Zero  
Negative
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T15:13:19.745Z  

```java
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int num;
        num = scanner.nextInt(); // input first number
        // Check first number
        if (num >0){
            System.out.println("Positive");
        } else if (num < 0){
            System.out.println("Negative");
            
        } else{
            System.out.println("Zero");
        }
    
        
        
        num = scanner.nextInt(); // input second number
        // Check second number
        if (num > 0){
            System.out.println("Positive");
        }else if (num <0){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
        
        num = scanner.nextInt(); // input third number
        // Check third number
        if (num >0){
            System.out.println("Positive");
        }else if (num < 0){
            System.out.println("Negative");
            
        }else{
            System.out.println("Zero");
        }
       scanner.close(); 
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS59)