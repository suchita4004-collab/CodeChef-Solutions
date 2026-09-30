# SHUFFLEHD

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Shuffle (Hard)

 **This is the hard version of the problem. Here, the final permutation $Q$ can be any permutation.** 

For a permutation $P$ of the integers $[1, N]$ and an integer $K$, define $f(P, K)$ as the permutation formed at the end of the following process:

- For each $i = 1, 2, \ldots, N - K + 1$ (in this order), sort the subarray $P[i, i + K - 1]$.

For example, $f([3, 2, 1], 2) = [2, 1, 3]$. First $P[1, 2]$ gets sorted, so $P = [2, 3, 1]$ and then $P[2, 3]$ gets sorted, so $P = [2, 1, 3]$.

You are given integers $N$ and $K$, and a permutation $Q$.

Count the number of permutations $P$ such that $f(P, K) = Q$ modulo $998244353$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains $2$ integers - $N$ and $K$. The second line contains $N$ integers - $Q_1, Q_2, \ldots, Q_N$.
### Output Format

For each test case, output on a new line the number of permutations $P$ modulo $998244353$.

### Constraints
- $1 \le T \le 10^4$
- $2 \le K \le N \le 2 \cdot 10^5$
- $1 \le Q_i \le N$
- $Q_i \ne Q_j$ for all $i \ne j$
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$.
### Sample 1:
Input
Output

```
6
3 2
1 2 3
3 3
1 2 3
5 3
1 2 3 4 5
3 2
2 1 3
3 2
3 2 1
5 3
3 2 1 4 5

```

```
4
6
54
2
0
6
```

### Explanation:

 **Test Case 1:**  The valid permutations $P$ are $[1, 2, 3]$, $[2, 1, 3]$, $[1, 3, 2]$ and $[3, 1, 2]$.

 **Test Case 4:**  The valid permutations $P$ are $[2, 3, 1]$ and $[3, 2, 1]$.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T14:46:19.102Z  

```py
MOD = 998244353

T = int(input())

# Precompute factorials
MAX_N = 200000
fact = [1] * (MAX_N + 1)

for i in range(1, MAX_N + 1):
    fact[i] = fact[i - 1] * i % MOD

for _ in range(T):
    N, K = map(int, input().split())
    Q = list(map(int, input().split()))

    L = N - K + 1

    # Last K-1 elements must be L+1, L+2, ..., N
    valid = True

    for i in range(L, N):
        if Q[i] != i + 1:
            valid = False
            break

    if not valid:
        print(0)
        continue

    # Count left-to-right maximums in first L elements
    maximum = 0
    records = 0

    for i in range(L):
        if Q[i] > maximum:
            maximum = Q[i]
            records += 1

    answer = fact[K] * pow(K, records - 1, MOD) % MOD

    print(answer)
```

---

[View on CodeChef](https://www.codechef.com/problems/SHUFFLEHD)