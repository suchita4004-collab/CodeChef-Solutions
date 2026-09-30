# cook your dish here
MOD = 998244353

T = int(input())

for _ in range(T):
    N, K = map(int, input().split())
    Q = list(map(int, input().split()))

    factorial = 1

    for i in range(1, K + 1):
        factorial = (factorial * i) % MOD

    answer = factorial * pow(K, N - K, MOD) % MOD

    print(answer)