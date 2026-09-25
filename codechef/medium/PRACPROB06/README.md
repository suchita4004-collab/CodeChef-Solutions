# PRACPROB06

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Accessing Array Element

What will be the output of the following Java code snippet?

```
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int index = 2;
        System.out.println(numbers[index]);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:43:19.324Z  

```cpp
import java.util.*;

class OddRooms {
    public static void main(String[] args) {
    //Your code goes here  
      Scanner scanner = new Scanner(System.in);
      
      int n= scanner.nextInt();
      
      for(int i=0;i<n;i++){
          int room=scanner.nextInt();
          
          
          if (room % 2 !=0){
              
              
              System.out.println(room + " ");
          }      }
       
       scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PRACPROB06)