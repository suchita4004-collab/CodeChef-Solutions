# CLGOPJP38

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Assignment Operators

In Java programming, assignment operators help you set or change the value of a variable. They're like little shortcuts that combine assignment with other operations.

#### Basic Assignment

Here's a simple example:

```
int length = 15;

```

In this example, the  **`=`**  operator sets the value of `length` to 15.

#### Compound Assignment Operators

There are also compound assignment operators that perform an operation and then assign the result back to the variable. Let's look at a few:

- x -= 5        (Subtracts 5 from x and assigns the result back to x)
- x *= 3        (Multiplies x by 3 and assigns the result back to x)
- x /= 3        (Divides x by 3 and assigns the result back to x)
- x %= 3        (Finds the remainder when x is divided by 3 and assigns the result back to x)
### Task
- Using an assignment operator, output the remainder when length is divided by 3.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T16:27:44.634Z  

```java
class Codechef
{
	public static void main (String[] args)
	{
	    int length = 6;
	    int div= length /=3;
	    System.out.println (div);
	    
	   // Update your code below this line
		
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP38)