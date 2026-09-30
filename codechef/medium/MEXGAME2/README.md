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

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T14:58:56.274Z  

```c_cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int T;
    cin >> T;

    while (T--) {
        int N;
        cin >> N;

        vector<int> A(N + 1);
        int maxA = 0;

        for (int i = 1; i <= N; i++) {
            cin >> A[i];
            maxA = max(maxA, A[i]);
        }

        // Prefix parity of sum
        vector<int> prefSum(N + 1, 0);

        for (int i = 1; i <= N; i++) {
            prefSum[i] = prefSum[i - 1] ^ (A[i] & 1);
        }

        // Global MEX.
        // No subarray can have MEX greater than the MEX of the whole array.
        vector<int> present(maxA + 2, 0);

        for (int i = 1; i <= N; i++) {
            if (A[i] <= maxA + 1)
                present[A[i]] = 1;
        }

        int globalMex = 0;

        while (globalMex < (int)present.size() &&
               present[globalMex]) {
            globalMex++;
        }

        long long answer = 0;

        /*
            For a subarray with MEX = m:

            Number of valid moves =
                sum(A)
                - 1 - 2 - ... - (m-1)
                - (m+1) * count(values >= m+1)

            Therefore the parity can be checked using prefix parity.

            For odd m:
                state = prefixSumParity

            For even m:
                state = prefixSumParity
                        XOR prefixParity(count of values >= m+1)

            Alice wins when:
                state[R] XOR state[L-1]
                XOR parity(m*(m-1)/2)
                = 1
        */

        for (int m = 0; m <= globalMex; m++) {

            // state[i] = parity information for prefix [1..i]
            vector<unsigned char> state(N + 1);

            // prefix count of state = 1
            vector<int> prefOne(N + 1, 0);

            int highParity = 0;

            for (int i = 1; i <= N; i++) {

                if ((m & 1) == 0 && A[i] >= m + 1) {
                    highParity ^= 1;
                }

                if (m & 1) {
                    state[i] = prefSum[i];
                } else {
                    state[i] = prefSum[i] ^ highParity;
                }

                prefOne[i] = prefOne[i - 1] + state[i];
            }

            /*
                last[x] = last occurrence of x
                for x < m.

                A subarray [L..R] has MEX m iff:

                    every 0..m-1 occurs
                    m does not occur

                Therefore:

                    last[m] < L
                    L <= minimum(last[0], ..., last[m-1])

                Using j = L-1:

                    last[m] <= j < minimum_last
            */

            vector<int> last(m, 0);

            // active[position] tells whether that position
            // is currently the last occurrence of some x < m.
            vector<unsigned char> active(N + 1, 0);

            int seen = 0;
            int minimumLast = 1;
            int lastMex = 0;

            // Prefix-index window [left ... right]
            int left = 0;
            int right = -1;

            // Number of state 0/1 inside the current window
            int cntOne = 0;
            int cntZero = 0;

            int target = 1 ^ ((m / 2) & 1);

            for (int r = 1; r <= N; r++) {

                int x = A[r];

                // Update last occurrence of values < MEX
                if (x < m) {

                    if (last[x] != 0) {
                        active[last[x]] = 0;
                    } else {
                        seen++;
                    }

                    last[x] = r;
                    active[r] = 1;
                }

                // Last occurrence of MEX
                if (x == m) {
                    lastMex = r;
                }

                int hi;

                if (m == 0) {
                    // No values are required.
                    hi = r - 1;
                }
                else {
                    // Not all 0..m-1 are present yet.
                    if (seen < m) {
                        continue;
                    }

                    // Find minimum last occurrence.
                    while (minimumLast <= r &&
                           !active[minimumLast]) {
                        minimumLast++;
                    }

                    hi = minimumLast - 1;
                }

                // Valid prefix indices are:
                // [lastMex, hi]
                if (lastMex > hi) {
                    continue;
                }

                /*
                    Expand right side of prefix-index window.
                */
                while (right < hi) {
                    right++;

                    if (state[right]) {
                        cntOne++;
                    } else {
                        cntZero++;
                    }
                }

                /*
                    Move left side of prefix-index window.
                */
                while (left < lastMex) {

                    if (state[left]) {
                        cntOne--;
                    } else {
                        cntZero--;
                    }

                    left++;
                }

                // State of prefix [1..r]
                int currentState = state[r];

                // We need:
                //
                // currentState XOR state[j] = target
                //
                int needed = currentState ^ target;

                if (needed == 1) {
                    answer += cntOne;
                } else {
                    answer += cntZero;
                }
            }
        }

        cout << answer << '\n';
    }

    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MEXGAME2)