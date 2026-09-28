# cook your dish here
N = int(input())
M = int(input())

count_A = {}

for _ in range(N):
    row = map(int, input().split())
    for x in row:
        count_A[x] = count_A.get(x, 0) + 1

count_B = {}

for _ in range(M):
    row = map(int, input().split())
    for x in row:
        count_B[x] = count_B.get(x, 0) + 1

answer = True

for x in count_B:
    if count_A.get(x, 0) < count_B[x]:
        answer = False
        break

if answer:
    print("TRUE")
else:
    print("FALSE")