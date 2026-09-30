import sys

input = sys.stdin.readline

T = int(input())

for _ in range(T):
    N = int(input())
    A = list(map(int, input().split()))

    # Prefix parity of sum
    pref = [0] * (N + 1)

    s = 0
    for i in range(N):
        s ^= A[i] & 1
        pref[i + 1] = s

    answer = 0

    # A[i] <= 100, so MEX <= 101
    limit = min(101, N + 1)

    for mex in range(limit):

        odd_mex = mex & 1

        # Alice needs odd number of moves.
        target = 1 ^ ((mex // 2) & 1)

        # Last occurrence of 0 ... mex-1
        last = [0] * mex

        # active[pos] = 1 if pos is currently the last
        # occurrence of one of 0 ... mex-1
        active = bytearray(N + 1)

        seen = 0
        minimum_last = 1
        last_mex = 0

        # The valid prefix-index range is:
        # [last_mex, minimum_last - 1]

        left = 0
        right = -1

        count0 = 0
        count1 = 0

        # For even MEX, state needs parity of
        # number of elements >= mex + 1.
        high_parity = 0

        # We use this when moving 'right'.
        right_high = 0

        # We use this when moving 'left'.
        left_high = 0

        for r in range(1, N + 1):

            x = A[r - 1]

            # State of prefix [1 ... r]
            if not odd_mex and x >= mex + 1:
                high_parity ^= 1

            if odd_mex:
                current_state = pref[r]
            else:
                current_state = pref[r] ^ high_parity

            # Update last occurrences of values below MEX
            if x < mex:
                old = last[x]

                if old:
                    active[old] = 0
                else:
                    seen += 1

                last[x] = r
                active[r] = 1

            # Last occurrence of MEX
            if x == mex:
                last_mex = r

            # Find minimum last occurrence
            if mex == 0:
                minimum_last = r

            elif seen == mex:
                while minimum_last <= r and not active[minimum_last]:
                    minimum_last += 1
            else:
                continue

            # Prefix indices j must satisfy:
            #
            # last_mex <= j < minimum_last
            #
            # corresponding subarray is [j+1 ... r]

            right_limit = minimum_last - 1

            if last_mex > right_limit:
                continue

            # Expand right end of our state-count window
            while right < right_limit:
                right += 1

                if not odd_mex and right > 0:
                    if A[right - 1] >= mex + 1:
                        right_high ^= 1

                if odd_mex:
                    state = pref[right]
                else:
                    state = pref[right] ^ right_high

                if state:
                    count1 += 1
                else:
                    count0 += 1

            # Remove prefix indices from the left
            while left < last_mex:

                if not odd_mex and left > 0:
                    if A[left - 1] >= mex + 1:
                        left_high ^= 1

                if odd_mex:
                    state = pref[left]
                else:
                    state = pref[left] ^ left_high

                if state:
                    count1 -= 1
                else:
                    count0 -= 1

                left += 1

            # We need:
            #
            # current_state XOR state[j] = target
            #
            needed = current_state ^ target

            if needed == 0:
                answer += count0
            else:
                answer += count1

    print(answer)