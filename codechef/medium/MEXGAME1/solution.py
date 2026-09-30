# cook your dish here
T = int(input())

for _ in range(T):
    N = int(input())
    A = list(map(int, input().split()))

    present = [False] * (N + 2)

    for x in A:
        if x <= N + 1:
            present[x] = True

    mex = 0
    while present[mex]:
        mex += 1

    total = sum(A)

    final_sum = mex * (mex - 1) // 2
    final_sum += (N - mex) * (mex + 1)

    moves = total - final_sum

    if moves % 2 == 1:
        print("Alice")
    else:
        print("Bob")