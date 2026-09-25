# XNDQM675

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Modify Even Elements

You are required to read a list of numbers from the user, check each one, and apply a specific update based on whether the number is even or odd.

 **Tasks** :

- Take an integer n as input — this represents the size of the ArrayList.
- Take input of n integers from the user and store them in an ArratList.
- For each element in the ArrayList: If the element is even, update it by adding 1. If the element is odd, leave it unchanged.
- Print the entire updated array.
### Sample 1:
Input
Output

```
5
10 3 4 7 8
```

```
Updated Array:
11
3
5
7
9
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:39:03.234Z  

```java
import java.util.ArrayList;
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take size of ArrayList as input
        int n = sc.nextInt();

        // Step 2: Declare ArrayList

int[] arr= new int[n];
        // Step 3: Take input and add to ArrayList

for (int i = 0; i < n; i++){
    arr[i]=sc.nextInt();
}

        // Step 4: Update even elements

for (int i = 0; i < n; i++){
    if(arr[i] % 2  == 0) {
        
        arr[i] = arr[i] + 1;
    }
}



        // Step 5: Print the updated list
        System.out.println("Updated Array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");
        }

        sc.close(); // Close the scanner
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/XNDQM675)