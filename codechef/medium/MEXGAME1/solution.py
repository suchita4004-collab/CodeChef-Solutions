T = int(input())

for _ in range(T):
    N = int(input())
    A = list(map(int, input().split()))

    count = [0] * 102

    for x in A:
        count[x] += 1

    # Find MEX
    mex = 0
    while count[mex] > 0:
        mex += 1

    moves = 0

    # Extra occurrences of values below MEX
    for x in range(1, mex):
        moves += (count[x] - 1) * x

    # Values greater than MEX + 1
    for x in range(mex + 2, 102):
        moves += count[x] * (x - mex - 1)

    if moves % 2 == 1:
        print("Alice")
    else:
        print("Bob")