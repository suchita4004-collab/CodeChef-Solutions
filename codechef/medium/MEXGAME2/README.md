# MEXGAME2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MEX Game (Hard)

Alice and Bob are playing a game on an array $A$ of $N$ integers. Alice goes first.

On each of their turn, they choose some index $i$ such that $A_i > 0$, and replace it with $A_i - 1$.

Such a move is valid only if the MEX$^{\dagger}$ value of the entire array does not change. The player unable to make a valid move loses.

You are given an array $A$ of $N$ integers. Count the number of pairs of integers $(L, R)$ such that:

- $1 \le L \le R \le N$
- Alice wins the game on the subarray $[A_L, A_{L + 1}, \ldots, A_R]$

$^{\dagger}$ The MEX of an array is the minimal non-negative element not included in the array.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains a single integer $N$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line the winner of the game.

### Constraints
- $1 \le T \le 10^4$
- $1 \le N \le 2 \cdot 10^5$
- $0 \le A_i \le 100$
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$.
### Sample 1:
Input
Output

```
4
3
0 3 0
4
0 1 2 3
4
0 0 1 1
1
100

```

```
3
4
2
1
```

### Explanation:

 **Test Case 1:**  The subarrays $[0, 3]$, $[3, 0]$ and $[0, 3, 0]$ are winning for Alice. $[0]$ and $[3]$ are losing.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T14:50:15.903Z  

```py
# cook your dish here
import sys

input = sys.stdin.readline

T = int(input())

for _ in range(T):
    N = int(input())
    A = list(map(int, input().split()))

    # Prefix parity of sum(A)
    pref = [0] * (N + 1)

    for i in range(N):
        pref[i + 1] = pref[i] ^ (A[i] & 1)

    answer = 0

    # MEX can be at most 101
    for mex in range(min(N, 101) + 1):

        last = [0] * mex
        last_mex = 0

        # State of every prefix.
        state = [0] * (N + 1)

        if mex % 2 == 0:
            parity_ge = 0

            for i in range(1, N + 1):
                if A[i - 1] >= mex + 1:
                    parity_ge ^= 1

                state[i] = pref[i] ^ parity_ge
        else:
            for i in range(N + 1):
                state[i] = pref[i]

        # Prefix counts of state 0 and state 1
        cnt0 = [0] * (N + 1)
        cnt1 = [0] * (N + 1)

        for i in range(N + 1):
            if i > 0:
                cnt0[i] = cnt0[i - 1]
                cnt1[i] = cnt1[i - 1]

            if state[i] == 0:
                cnt0[i] += 1
            else:
                cnt1[i] += 1

        target = 1 ^ ((mex // 2) & 1)

        for r in range(1, N + 1):

            x = A[r - 1]

            if x < mex:
                last[x] = r

            if x == mex:
                last_mex = r

            if mex == 0:
                minimum_last = r
            else:
                minimum_last = min(last)

            if minimum_last <= last_mex:
                continue

            needed = state[r] ^ target

            left = last_mex
            right = minimum_last - 1

            if needed == 0:
                answer += cnt0[right]

                if left > 0:
                    answer -= cnt0[left - 1]
            else:
                answer += cnt1[right]

                if left > 0:
                    answer -= cnt1[left - 1]

    print(answer)
```

---

[View on CodeChef](https://www.codechef.com/problems/MEXGAME2)