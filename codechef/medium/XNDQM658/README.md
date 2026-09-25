# XNDQM658

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Student Attendance Tracker

You are developing a simple attendance tracker using Java. Your task is to store and retrieve the attendance count for students in the first three weeks of class using an `ArrayList`.

```
Week1=28, Week2=30, Week3=27

```

 **Expected Output:** 

```
Attendance in Week 1: 28
Attendance in Week 3: 27

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T13:37:25.747Z  

```java
import java.util.ArrayList;

class Codechef {

    public static void main(String[] args) {
        
        int Week1=28, Week2=30, Week3=27;
        ArrayList<Integer> attendanceList = new ArrayList<>();

        // Step 2: Add attendance for 3 weeks

attendanceList.add(28);
attendanceList.add(30);
attendanceList.add(27);


        // Step 3: Access and print attendance using .get() method
System.out.println("Attendance in Week 1:"+ attendanceList.get(0));
System.out.println("Attendance in Week 2:"+ attendanceList.get(2));

    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/XNDQM658)