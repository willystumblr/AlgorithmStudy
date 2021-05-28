#백준 11052

import sys
input = sys.stdin.readline
N = int(input())
p = list(map(int, input().split()))
d = [0]*(N+1)
d[1] = p[0]
d[2] = max(p[1], p[0]*2)
for i in range(3, N+1):
    d[i] = p[i-1]
    for k in range(1, i+1):
        d[i] = max(d[i], d[i-k]+p[k-1])
    

print(d[N])
