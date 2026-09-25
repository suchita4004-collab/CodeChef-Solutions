# PRACPROB11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum of Array Elements

Write a Java program to calculate the sum of all elements in an integer array using a `for` loop. You are given an array of integers. Your task is to iterate through the array using a `for` loop and add each element to a variable called `sum`. Finally, print the value of `sum`.

For example, if the array is `{1, 2, 3, 4, 5}`, the program should output `15`.

```
public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        // Your code here to calculate the sum using a for loop

        System.out.println(sum);
    }
}

```

Which of the following code snippets, when inserted into the `// Your code here` section, will correctly calculate the sum of the array elements?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:49:29.017Z  

```cpp
import java.util.Scanner;
import java.util.Arrays; // For sorting the array

class LargestScoreGap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("0");
            scanner.close();
            return; 
        }

        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        Arrays.sort(scores);

        int maxGap = 0;

        // --- START OF MISSING CODE ---
       
       for(int i=1;i< scores.length;i++){
           int gap =scores[i] - scores[i -1];
           
           if(gap > maxGap) {
               maxGap =gap;
               
           }
       }
       
       
       
       
       

        // --- END OF MISSING CODE ---

        System.out.println(maxGap);
        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PRACPROB11)