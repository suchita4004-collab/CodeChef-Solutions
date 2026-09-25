# PRACPROB13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:55:55.436Z  

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

[View on CodeChef](https://www.codechef.com/problems/PRACPROB13)