# LJAAS110

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a program that uses a do-while loop to find the factorial of a given input number.

### Sample 1:
Input
Output

```
5
```

```
120
```

### Explanation:

1 x 2 x 3 x 4 x 5 = 120

### Sample 2:
Input
Output

```
6
```

```
720
```

### Explanation:

1 x 2 x 3 x 4 x 5 x 6 = 720

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T15:48:45.057Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long factorial =1;
		int i =1;
		
		do {
		    factorial *= i;
		    i++;
		}while (i <= n);
		
		System.out.println(factorial);
		
		scanner.close();
		// your code goes here

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS110)