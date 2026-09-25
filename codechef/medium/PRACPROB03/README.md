# PRACPROB03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sentence Word Reverser

Chef has recently started learning Java. As part of his practice, he is working on strings and arrays. Today, his task is to take a sentence as input and print the sentence with the order of the words reversed.

You are required to help Chef by writing a program that reads a sentence and outputs the sentence with the words in reverse order.

Words in the sentence are separated by a single space.

### Input Format
- A single line containing a sentence S.
### Output Format
- Print the sentence with the words in reverse order.
### Sample 1:
Input
Output

```
Java is fun
```

```
fun is Java
```

### Sample 2:
Input
Output

```
Hello World
```

```
World Hello
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:09:02.826Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/PRACPROB03)