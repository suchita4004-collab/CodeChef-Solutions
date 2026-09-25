# CLGOPJP33

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Negative Numbers

In `Java`, when you divide an integer by another integer, you get only the integer value of the quotient.

For example,

```
int a = 3;
int b = 2;
System.out.println(a / b);

// Output:
// 1

```

Value of 3 / 2 is 1.5, but here the output is rounded down to the nearest integer.

### Task

Write a program which does the following:

- Display the sum, product, and quotient of 2 integers : -50 & 40.
- Initialise the following variables in your program and use them in the computation. Variable a and assign it the value -50. Variable b and assign it the value 40. Variables sum, product and quotient - assign the relevant values to them: sum = a + b product = a * b quotient = a / b

Note -  ***`sum`**  *,  ***`product`***  and  ***`quotient`** * need to be integers.

- Output sum, product and quotient to the console on separate lines.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T16:26:39.094Z  

```java
class Codechef
{
	public static void main (String[] args)
	{
		int a = -50;
		int b = 40;
		int sum=a+b;
		int product=a*b;
		int quotined=a/b;
		System.out.println(sum);
		System.out.println(product);
		System.out.println(quotined);
		// update your code belowhis line
		
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP33)