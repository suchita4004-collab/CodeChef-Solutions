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