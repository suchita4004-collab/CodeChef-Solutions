# MEXGAME1

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MEX Game (Easy)

Alice and Bob are playing a game on an array $A$ of $N$ integers. Alice goes first.

On each of their turn, they choose some index $i$ such that $A_i > 0$, and replace it with $A_i - 1$.

Such a move is valid only if the MEX$^{\dagger}$ value of the entire array does not change. The player unable to make a valid move loses.

You are given an array $A$ of $N$ integers. Output $\text{Alice}$ if she wins the game on this array, or $\text{Bob}$ if he does.

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
Alice
Bob
Alice
Alice

```

### Explanation:

 **Test Case 1:**  Alice can make the first move on $2^{nd}$ index to get the array $[0, 2, 0]$, and then Bob can make no further move. $[0, 1, 0]$ would make the MEX $2$ instead of $1$.

 **Test Case 2:**  Alice has no initial valid move to make. Any move changes the MEX.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T14:39:47.697Z  

```py
T = int(input())

for _ in range(T):
    N = int(input())
    A = list(map(int, input().split()))

    count = [0] * 102

    for x in A:
        count[x] += 1

    # Find MEX
    mex = 0
    while count[mex] > 0:
        mex += 1

    moves = 0

    # Extra occurrences of values below MEX
    for x in range(1, mex):
        moves += (count[x] - 1) * x

    # Values greater than MEX + 1
    for x in range(mex + 2, 102):
        moves += count[x] * (x - mex - 1)

    if moves % 2 == 1:
        print("Alice")
    else:
        print("Bob")
```

---

[View on CodeChef](https://www.codechef.com/problems/MEXGAME1)