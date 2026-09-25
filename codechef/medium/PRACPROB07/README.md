# PRACPROB07

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Long Word Count

You are given a sentence as input. Your task is to write a Java program that counts the number of words in the sentence that have 6 or more characters. The sentence will only contain letters and spaces, and words are separated by single spaces.

### Input Format
- A single line containing a sentence with only letters (a-z, A-Z) and single spaces between words.
### Output Format
- A single integer: the number of words with 6 or more characters.
### Sample 1:
Input
Output

```
Chef loves programming and algorithms
```

```
2
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:43:29.565Z  

```java
import java.util.Scanner;

class LongWordCount {

    public static void main(String[] args) {
    // Your code goes here   
       Scanner scanner =new Scanner(System.in);
       String sentence = scanner.nextLine();
       String[] words =sentence.split(" ");
       
       int count=0;
       
       for (int i=0;i < words.length;i++){
           if (words[i].length() >=6) {
               count ++;
           }
       }
       System.out.println(count);
       
       scanner.close();
       
       
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PRACPROB07)