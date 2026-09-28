# cook your dish here
S = input().strip()
K = int(input())

freq = [0] * 26

for ch in S:
    freq[ord(ch) - ord('a')] += 1

for _ in range(K):
    max_index = 0

    for i in range(26):
        if freq[i] > freq[max_index]:
            max_index = i

    if freq[max_index] == 0:
        break

    freq[max_index] -= 1

answer = 0

for f in freq:
    answer += f * f

print(answer)