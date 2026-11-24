# CLGOPJP297

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in mitwpu_9120 1272261561.s@mitwpu.edu.in

Write a Java program that uses multithreading to calculate the sum of elements in an array of size 9 concurrently. The program should divide the array into three segments, and each thread should calculate the sum of a segment. Finally, the main thread should combine the individual sums to calculate the total sum of the array.

 **Requirements:** 

- Create an array of integers with 9 elements containing the values [1, 2, 3, 4, 5, 6, 7, 8, 9].
- Divide the array into three segments, with each segment containing three elements.
- Create a separate thread for each segment to calculate the sum of that segment concurrently.
- After all threads have completed, combine the individual segment sums to calculate the total sum of the array.
- Display the individual segment sums and the total sum.

This program divides the array into three segments and calculates the sum of each segment concurrently using separate threads. It then combines the segment sums to calculate the total sum of the array and displays the results.

### Task

Complete the `calculateSegmentSum` function to use multithreading to calculate the sum of elements in an array concurrently.

### Sample 1:
Input
Output

```
 
```

```
Segment 0 Sum: 6
Segment 1 Sum: 15
Segment 2 Sum: 24
Total Sum: 45
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T07:23:54.174Z  

```java
import java.util.ArrayList;
import java.util.List;

class Codechef {
    public static final int ARRAY_SIZE = 9;
    public static final int NUM_SEGMENTS = 3;
    
    // Object for synchronization
    private static final Object lock = new Object();

    // Function to calculate the sum of a segment
    static void calculateSegmentSum(List<Integer> array, int segmentId, int[] segmentSum) {
        int start =segmentId * 3;
        int end = start + 3;
        int sum = 0;
        for (int i = start; i < end; i++){
            sum += array.get(i);
        }
        segmentSum[segmentId]=sum;
        
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int i = 1; i <= 9 ; ++i) {
            array.add(i);
        }

        // Threads list stores all the threads
        List<Thread> threads = new ArrayList<>();

        // SegmentSums array stores the sum of each segment
        int[] segmentSums = new int[NUM_SEGMENTS];

        // Create threads to calculate segment sums
        for (int i = 0; i < NUM_SEGMENTS; ++i) {
            final int segmentId = i;
            threads.add(new Thread(() -> calculateSegmentSum(array, segmentId, segmentSums)));
        }

        // Start all threads
        for (Thread thread : threads) {
            thread.start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Calculate the total sum by combining segment sums
        int totalSum = 0;
        for (int segmentSum : segmentSums) {
            totalSum += segmentSum;
        }

        // Display individual segment sums and the total sum
        for (int i = 0; i < NUM_SEGMENTS; ++i) {
            System.out.println("Segment " + i + " Sum: " + segmentSums[i]);
        }
        System.out.println("Total Sum: " + totalSum);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLGOPJP297)