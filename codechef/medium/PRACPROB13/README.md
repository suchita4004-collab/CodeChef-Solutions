# PRACPROB13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### ArrayList Removal by Index

Consider an `ArrayList` named `numbers` that initially contains the integers: `[10, 20, 30, 40, 50]`. You want to remove the element at index 2. What will be the contents of the `numbers` ArrayList after executing the following line of code?

```
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.remove(2);

        // What will be the content of numbers here?
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:56:02.685Z  

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

[View on CodeChef](https://www.codechef.com/problems/PRACPROB13)