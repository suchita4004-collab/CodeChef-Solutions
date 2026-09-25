# PRACPROB15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### 2D Array Declaration - Correct Syntax

Which of the following is the correct way to declare and initialize a 2D array of integers with 3 rows and 4 columns in Java?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:56:35.263Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/PRACPROB15)