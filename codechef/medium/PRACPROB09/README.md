# PRACPROB09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Array Default Values

What are the default values of elements in an array in Java if no explicit values are assigned during initialization? Consider the following code snippet and select the correct statements about the default values of different data types in Java arrays.

```
public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        boolean[] booleanArray = new boolean[2];
        String[] stringArray = new String[2];

        System.out.println("Int Array Default: " + intArray[0]);
        System.out.println("Boolean Array Default: " + booleanArray[0]);
        System.out.println("String Array Default: " + stringArray[0]);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:43:52.097Z  

```cpp
import java.util.Scanner;

class ScoreCorrector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        // --- START OF INCOMPLETE CODE ---
        for (int i = 0; i < scores.length; i++) {
            // Your code to check and replace negative scores goes here
            
            
           if(scores[i]<0) {
               scores[i]=0;
           }
            
        }
        // --- END OF INCOMPLETE CODE ---

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PRACPROB09)