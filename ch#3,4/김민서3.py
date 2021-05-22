#백준 1931
import sys
N = int(input())
meeting = [(tuple(map(int, sys.stdin.readline().split()))) for _ in range(N)]
meeting.sort(key= lambda x: (x[1], x[0]))

count = 1
std = meeting[0][1]
for i in range (1, N):
    if meeting[i][0] >= std:
        count+=1
        std = meeting[i][1]

print(count)
