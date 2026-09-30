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