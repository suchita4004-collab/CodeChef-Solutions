# PRACPROB04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### ArrayList Iteration - Sum of Odd Numbers

You are given an `ArrayList` of integers called `numbers`. Your task is to write code that iterates through the `ArrayList` using a `for` loop and calculates the sum of all odd numbers present in the list.

Choose the option that correctly calculates the sum of odd numbers in the `ArrayList`.

A

```
int sum = 0;
for (int i = 0; i < numbers.size(); i++) {
    if (numbers.get(i) % 2 == 0) {
        sum += numbers.get(i);
    }
}

```

B

```
int sum = 0;
for (int i = 0; i <= numbers.size(); i++) {
    if (numbers.get(i) % 2 != 0) {
        sum += numbers.get(i);
    }
}

```

C

```
int sum = 0;
for (int i = 0; i < numbers.size(); i++) {
    if (numbers.get(i) % 2 != 0) {
        sum += numbers.get(i);
    }
}

```

D

```
int sum = 0;
for (int i = 1; i < numbers.size(); i++) {
    sum += numbers.get(i);
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:09:52.872Z  

```cpp
import java.util.Scanner;

class SentenceWordReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        String reversedSentence = "";

        // --- START OF YOUR CODE ---
       
       
      for (int i=words.length -1;i>=0;i--){
          reversedSentence += words[i];
          if(i>0){
          reversedSentence += " ";
          }
      } 
       
       
       

        // --- END OF YOUR CODE ---

        System.out.println(reversedSentence.trim());
        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PRACPROB04)