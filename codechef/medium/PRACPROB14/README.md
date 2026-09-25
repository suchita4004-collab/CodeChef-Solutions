# PRACPROB14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### ArrayList Element Check

You have an `ArrayList` of strings called `names`. Your task is to determine if the name "Alice" exists in the `names` ArrayList.

```
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Your code here to check if "Alice" exists in the ArrayList
        boolean exists = names.contains("Alice");

        if (exists) {
            System.out.println("Alice exists in the list.");
        } else {
            System.out.println("Alice does not exist in the list.");
        }
    }
}

```

Which of the following options correctly determines if "Alice" exists in the `names` ArrayList and prints the correct output?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:56:18.456Z  

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

[View on CodeChef](https://www.codechef.com/problems/PRACPROB14)