# PRACPROB10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Largest Exam Score Gap

A teacher is analyzing the score distribution of a recent exam. She wants to find the largest gap between any two adjacent scores after sorting them in ascending order.

Your task is to write a program that:

- Reads a list of scores,
- Sorts them,
- Finds the largest difference between any two adjacent scores, and
- Prints the largest gap.

Note:

- "If there are fewer than two scores (i.e., 0 or 1 score), the largest gap is considered 0."
### Input Format
- The first line contains an integer N — the number of student scores.
- The second line contains N space-separated integers — the scores.
### Output Format
- Print a single integer — the largest gap between any two adjacent scores after sorting.
### Sample 1:
Input
Output

```
4
80 70 95 75
```

```
15
```

### Sample 2:
Input
Output

```
1
88
```

```
0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:49:18.554Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/PRACPROB10)