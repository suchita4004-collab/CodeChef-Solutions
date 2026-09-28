# MATNEARESTO

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Distance to Nearest 0

Given is a `N x M` binary matrix, for each cell find its distance from the nearest `0`.

 **Note:**  Distance between vertically or horizontally adjacent cells is `1`. (See the sample input/output for more clarity)

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the no. of rows and columns in the matrix.
- Next $N$ lines containing $M$ space separated integers, the elements of the matrix.
### Output Format
- Output $N$ lines containing $M$ space separated integers, the distance of each cell from nearest 0.
### Constraints
- $1 \leq N, M \leq 100$
- The elements of the matrix are either 0 or 1.
- There is at least one 0 in the matrix.
### Sample 1:
Input
Output

```
3 3
0 1 1
0 1 0
1 1 1
```

```
0 1 1
0 1 0
1 2 1
```

### Explanation:

Positions are written as $(row, column)$, starting from $1$.

- Cells $(1,1)$, $(2,1)$, and $(2,3)$ contain $0$, so their distance is $0$.
- Cells $(1,2)$, $(1,3)$, $(2,2)$, $(3,1)$, and $(3,3)$ are horizontally or vertically adjacent to a cell containing $0$, so their distance is $1$.
- Cell $(3,2)$ requires at least $2$ moves to reach a $0$. For example, move left to $(3,1)$, then up to $(2,1)$. Its distance is therefore $2$.

Only horizontal and vertical moves are allowed; diagonal moves are not allowed.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T14:41:23.664Z  

```py
# cook your dish here
from collections import deque

N, M = map(int, input().split())

matrix = []
distance = [[-1] * M for _ in range(N)]
queue = deque()

for i in range(N):
    row = list(map(int, input().split()))
    matrix.append(row)

    for j in range(M):
        if row[j] == 0:
            distance[i][j] = 0
            queue.append((i, j))

directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]

while queue:
    r, c = queue.popleft()

    for dr, dc in directions:
        nr = r + dr
        nc = c + dc

        if 0 <= nr < N and 0 <= nc < M:
            if distance[nr][nc] == -1:
                distance[nr][nc] = distance[r][c] + 1
                queue.append((nr, nc))

for i in range(N):
    print(*distance[i])
```

---

[View on CodeChef](https://www.codechef.com/problems/MATNEARESTO)