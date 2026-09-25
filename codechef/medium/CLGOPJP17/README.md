# CLGOPJP17

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Understanding the default code

Let's learn about the different elements of a Java program:

Let's take this example code:

```
class Codechef
{
	public static void main (String[] args)
	{
		System.out.println(12 + 7);
	}
}

```

- Class Declaration: class Codechef: This line begins with the keyword class, which tells Java that you're defining a new class. Codechef is the name of this class. In Java, every piece of code lives inside a class. Note that there is no semicolon at the end of class declaration.
- Main Method: public static void main (String[] args): This line defines the "main method". It's like the main entrance to a house; the execution of a Java program starts from here. public: This is an access modifier. It means that the method can be accessed from anywhere, both inside and outside the class. Without this, Java wouldn't be able to find this method to start the program. static: This means that the method belongs to the class, not to an instance of the class. Because of this, Java can run the method without creating an object of the class. void: This indicates that the method doesn't return any value. When the main method finishes, it doesn't give back any result to the program that called it. main: It's a special name that Java looks for when running a program. Note that there is no semicolon at the end of the main method.
- System.out.println Statement: System.out.println(12 + 7); We have already learned about this in a previous lesson.
- Curly Braces {}: The opening curly brace { after Codechef and main (String[] args) indicate the start of the class and method block respectively. The closing curly braces } indicate the end of these blocks.

This code, when run, will simply display `19` on the screen, which is the sum of 12 and 7.

Don't worry if all of this is a little too much for you. You will get used to all of this as you move ahead in the course. If you have any doubts about the concept right now, click on the help tab above and ask your question to get clarification.

### Task

Now that we have some idea of what these lines mean. I want you to write the complete code in the editor. It will help you in remembering all the lines.

Write the exact code which we discussed in this lesson, to output the sum of 12 and 7. If you miss anything like uppercase S in System and String, you will get an error, don't worry, just ask about the error in Help tab.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T16:24:15.032Z  

```java
// Write complete code to print the sum of 12 and 7
// Be careful about uppercase and lowercase letters
class Codechef
{
    public static void main (String[] args)
    {
        System.out.println(12+7);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP17)