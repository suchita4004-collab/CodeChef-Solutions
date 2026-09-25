# PRACPROB05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Purge the Evens from Room Numbers

A hotel is undergoing maintenance, and the manager has decided to temporarily close all even-numbered rooms. Only the odd-numbered rooms will remain open.

You are given a list of room numbers. Your task is to write a program that removes all even room numbers and prints only the odd-numbered room numbers, separated by spaces.

If no odd-numbered room remains, print nothing.

### Input Format
- The first line contains an integer N — the number of rooms.
- The second line contains N space-separated integers — the room numbers.
### Output Format
- Print the odd-numbered room numbers in the same order as the input, separated by spaces.
- If there are no odd room numbers, print nothing.
### Sample 1:
Input
Output

```
5
101 102 103 104 105
```

```
101 103 105
```

### Sample 2:
Input
Output

```
3
111 113 115

```

```
111 113 115
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:43:03.491Z  

```java
import java.util.*;

class OddRooms {
    public static void main(String[] args) {
    //Your code goes here  
      Scanner scanner = new Scanner(System.in);
      
      int n= scanner.nextInt();
      
      for(int i=0;i<n;i++){
          int room=scanner.nextInt();
          
          
          if (room % 2 !=0){
              
              
              System.out.println(room + " ");
          }      }
       
       scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PRACPROB05)