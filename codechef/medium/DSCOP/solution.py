# cook your dish here
T = int(input())

for _ in range(T):
    N = input().strip()

    for i in range(len(N) - 1):
        if N[i] > N[i + 1]:
            N = N[:i] + N[i + 1:]
            break
    else:
        N = N[:-1]

    print(int(N))