# CLGOPJP155

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Eligibility Checker for Students

You are tasked with designing a simple program that determines the eligibility of students based on their scores and ages.

 **Class Definitions:** 

- Student class: Attributes: name (String): The name of the student. score (int): The student's academic score. age (int): The age of the student. Methods: eligible(): A method that checks the student's eligibility and prints "YES" if the score is greater than 10 and the age is greater than 20. Otherwise, it prints "NO."

 **Main Class:** 

- Codechef class: The main method: Creates an instance of the Student class. Sets the name, score, and age attributes for the student with predefined values. Calls the eligible method to determine and display the student's eligibility.
### Task

Write the eligible method of student class to make Eligibility Checker for Students.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:04:53.660Z  

```java
class Student {
    public String name;
    public int score;
    public int age;

    public void eligible() {
        
        
    if (score > 10 && age > 20){
        System.out.println("YES");
    }else{
    System.out.println("NO");
        
    }
    }
}

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Student obj = new Student();
        obj.name = "Tom";
        obj.score = 15;
        obj.age = 21;
        obj.eligible();
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP155)