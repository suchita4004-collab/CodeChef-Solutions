T = int(input())

for _ in range(T):
    N = int(input())
    A = list(map(int, input().split()))

    count = [0] * (N + 2)

    for x in A:
        if x <= N + 1:
            count[x] += 1

    mex = 0
    while count[mex] > 0:
        mex += 1

    moves = 0

    # Extra occurrences below MEX
    for i in range(1, mex):
        moves += (count[i] - 1) * i

    # Values above MEX
    for i in range(mex + 2, N + 2):
        moves += count[i] * (i - mex - 1)

    if moves % 2 == 1:
        print("Alice")
    else:
        print("Bob")