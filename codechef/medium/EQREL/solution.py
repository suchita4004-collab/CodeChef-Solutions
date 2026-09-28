# cook your dish here
import sys

data = list(map(int, sys.stdin.read().split()))

N = data[0]
H = data[1:N + 1]

minimum = min(H)
answer = sum(H) - N * minimum

print(answer)
