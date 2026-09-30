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
**Submitted:** 2026-09-30T14:53:34.122Z  

```py
import sys

input = sys.stdin.readline

T = int(input())

for _ in range(T):
    N = int(input())
    A = list(map(int, input().split()))

    # Prefix parity of sum
    pref = [0] * (N + 1)

    s = 0
    for i in range(N):
        s ^= A[i] & 1
        pref[i + 1] = s

    answer = 0

    # A[i] <= 100, so MEX <= 101
    limit = min(101, N + 1)

    for mex in range(limit):

        odd_mex = mex & 1

        # Alice needs odd number of moves.
        target = 1 ^ ((mex // 2) & 1)

        # Last occurrence of 0 ... mex-1
        last = [0] * mex

        # active[pos] = 1 if pos is currently the last
        # occurrence of one of 0 ... mex-1
        active = bytearray(N + 1)

        seen = 0
        minimum_last = 1
        last_mex = 0

        # The valid prefix-index range is:
        # [last_mex, minimum_last - 1]

        left = 0
        right = -1

        count0 = 0
        count1 = 0

        # For even MEX, state needs parity of
        # number of elements >= mex + 1.
        high_parity = 0

        # We use this when moving 'right'.
        right_high = 0

        # We use this when moving 'left'.
        left_high = 0

        for r in range(1, N + 1):

            x = A[r - 1]

            # State of prefix [1 ... r]
            if not odd_mex and x >= mex + 1:
                high_parity ^= 1

            if odd_mex:
                current_state = pref[r]
            else:
                current_state = pref[r] ^ high_parity

            # Update last occurrences of values below MEX
            if x < mex:
                old = last[x]

                if old:
                    active[old] = 0
                else:
                    seen += 1

                last[x] = r
                active[r] = 1

            # Last occurrence of MEX
            if x == mex:
                last_mex = r

            # Find minimum last occurrence
            if mex == 0:
                minimum_last = r

            elif seen == mex:
                while minimum_last <= r and not active[minimum_last]:
                    minimum_last += 1
            else:
                continue

            # Prefix indices j must satisfy:
            #
            # last_mex <= j < minimum_last
            #
            # corresponding subarray is [j+1 ... r]

            right_limit = minimum_last - 1

            if last_mex > right_limit:
                continue

            # Expand right end of our state-count window
            while right < right_limit:
                right += 1

                if not odd_mex and right > 0:
                    if A[right - 1] >= mex + 1:
                        right_high ^= 1

                if odd_mex:
                    state = pref[right]
                else:
                    state = pref[right] ^ right_high

                if state:
                    count1 += 1
                else:
                    count0 += 1

            # Remove prefix indices from the left
            while left < last_mex:

                if not odd_mex and left > 0:
                    if A[left - 1] >= mex + 1:
                        left_high ^= 1

                if odd_mex:
                    state = pref[left]
                else:
                    state = pref[left] ^ left_high

                if state:
                    count1 -= 1
                else:
                    count0 -= 1

                left += 1

            # We need:
            #
            # current_state XOR state[j] = target
            #
            needed = current_state ^ target

            if needed == 0:
                answer += count0
            else:
                answer += count1

    print(answer)
```

---

[View on CodeChef](https://www.codechef.com/problems/MEXGAME2)