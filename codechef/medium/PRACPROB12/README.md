# PRACPROB12

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Exam Scores - Filter passing scores

A teacher has a list of exam scores for a class of students. A score is considered passing if it is greater than or equal to the average score of the class.

Your task is to write a program that:

- Calculates the average score of the class.
- Prints all the scores that are greater than or equal to the average.
### Input Format
- The first line contains an integer N — the number of exam scores.
- The second line contains N space-separated integers — the exam scores.
### Output Format
- Print all scores that are greater than or equal to the average, in the order they appear in the input. Each score should be separated by a space.
### Sample 1:
Input
Output

```
5
70 80 90 60 50
```

```
70 80 90
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:55:51.854Z  

```java
import java.util.*;

class PassingScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // Number of scores
        int[] scores = new int[N];
        int sum = 0;
        
        // Your code goes here 
        
        for (int i=0;i<N; i++){
            scores[i]= sc.nextInt();
            sum +=scores[i];
            
        }
        
        double average =(double) sum/N;
         for (int i =0; i <N;i++){
             if (scores[i] >= average){
                 System.out.println(scores[i] + " ");
             }
         }
        
          
      sc.close();  
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PRACPROB12)