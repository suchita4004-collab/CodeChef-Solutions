# cook your dish here
import sys

input = sys.stdin.readline

T = int(input())

for _ in range(T):
    N = int(input())
    A = list(map(int, input().split()))

    # Prefix parity of sum(A)
    pref = [0] * (N + 1)

    for i in range(N):
        pref[i + 1] = pref[i] ^ (A[i] & 1)

    answer = 0

    # MEX can be at most 101
    for mex in range(min(N, 101) + 1):

        last = [0] * mex
        last_mex = 0

        # State of every prefix.
        state = [0] * (N + 1)

        if mex % 2 == 0:
            parity_ge = 0

            for i in range(1, N + 1):
                if A[i - 1] >= mex + 1:
                    parity_ge ^= 1

                state[i] = pref[i] ^ parity_ge
        else:
            for i in range(N + 1):
                state[i] = pref[i]

        # Prefix counts of state 0 and state 1
        cnt0 = [0] * (N + 1)
        cnt1 = [0] * (N + 1)

        for i in range(N + 1):
            if i > 0:
                cnt0[i] = cnt0[i - 1]
                cnt1[i] = cnt1[i - 1]

            if state[i] == 0:
                cnt0[i] += 1
            else:
                cnt1[i] += 1

        target = 1 ^ ((mex // 2) & 1)

        for r in range(1, N + 1):

            x = A[r - 1]

            if x < mex:
                last[x] = r

            if x == mex:
                last_mex = r

            if mex == 0:
                minimum_last = r
            else:
                minimum_last = min(last)

            if minimum_last <= last_mex:
                continue

            needed = state[r] ^ target

            left = last_mex
            right = minimum_last - 1

            if needed == 0:
                answer += cnt0[right]

                if left > 0:
                    answer -= cnt0[left - 1]
            else:
                answer += cnt1[right]

                if left > 0:
                    answer -= cnt1[left - 1]

    print(answer)