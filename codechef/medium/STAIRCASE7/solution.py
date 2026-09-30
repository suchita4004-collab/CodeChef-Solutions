# cook your dish here
T = int(input())

for _ in range(T):
    N = int(input())
    A = list(map(int, input().split()))

    count = {}

    for i in range(N):
        value = A[i] - i

        if value not in count:
            count[value] = 0

        count[value] += 1

    maximum = max(count.values())

    print(N - maximum)