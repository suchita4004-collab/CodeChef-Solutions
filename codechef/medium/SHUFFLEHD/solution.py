# cook your dish here
MOD = 998244353

T = int(input())

for _ in range(T):
    N, K = map(int, input().split())
    Q = list(map(int, input().split()))

    # Last K-1 elements must be sorted
    valid = True

    for i in range(N - K + 2, N):
        if Q[i - 1] > Q[i]:
            valid = False
            break

    if not valid:
        print(0)
        continue

    # Count left-to-right maximums in first N-K+1 elements
    L = N - K + 1

    maximum = 0
    records = 0

    for i in range(L):
        if Q[i] > maximum:
            maximum = Q[i]
            records += 1

    # Answer = K! * K^(records - 1)
    factorial = 1

    for i in range(1, K + 1):
        factorial = factorial * i % MOD

    answer = factorial * pow(K, records - 1, MOD) % MOD

    print(answer)