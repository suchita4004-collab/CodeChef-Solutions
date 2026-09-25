# PRACPROB16

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### 2D Array Row Sum

You are given a 2D integer array called `matrix`. Your task is to calculate the sum of elements in each row of the `matrix` and print each row sum on a new line.

Which of the following code snippets correctly calculates and prints the sum of each row in the given `matrix`?

A

```
for (int i = 0; i < matrix.length; i++) {
    int sum = 0;
    for (int j = 0; j < matrix[i].length; j++) {
        sum += matrix[i][j];
    }
    System.out.println(sum);
}

```

B

```
for (int j = 0; j < matrix[0].length; j++) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
        sum += matrix[i][j];
    }
    System.out.println(sum);
}

```

C

```
int sum = 0;
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        sum += matrix[i][j];
    }
}
System.out.println(sum);

```

D

```
for (int i = 0; i < matrix.length; i++) {
    System.out.println(matrix[i]);
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:56:48.475Z  

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

[View on CodeChef](https://www.codechef.com/problems/PRACPROB16)