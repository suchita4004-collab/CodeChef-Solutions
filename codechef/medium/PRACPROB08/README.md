# PRACPROB08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Correcting Test Scores

A teacher is reviewing the test scores of students from a recent exam. Due to data entry mistakes, some of the scores were recorded as negative numbers, which is not valid.

Your task is to help the teacher by writing a program that processes the list of scores. For every negative score in the list, replace it with 0. Then, print the corrected list of scores, with each score on a new line.

### Input Format
- The first line contains a single integer N, the number of test scores.
- The second line contains N space-separated integers, where each integer represents a student's score (can be negative due to errors).
### Output Format
- Print N integers — the corrected scores — each on a new line.
### Sample 1:
Input
Output

```
5
75 -10 88 -5 92
```

```
75
0
88
0
92
```

### Sample 2:
Input
Output

```
3
-20 -50 -80
```

```
0
0
0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:43:43.507Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/PRACPROB08)