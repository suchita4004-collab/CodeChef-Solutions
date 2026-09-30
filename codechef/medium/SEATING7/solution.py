# cook your dish here
T = int(input())

for _ in range(T):
    N, M, K = map(int, input().split())
    occupied = list(map(int, input().split()))

    seats = [False] * (N + 1)

    for seat in occupied:
        seats[seat] = True

    answer = []

    for _ in range(K):
        for seat in range(1, N + 1):
            if not seats[seat]:
                seats[seat] = True
                answer.append(seat)
                break

    print(*answer)