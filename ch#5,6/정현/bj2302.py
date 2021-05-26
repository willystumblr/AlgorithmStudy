import sys
input = sys.stdin.readline

N = int(input())
M = int(input())
nvips = []
k=0
for i in range(M):
    a = int(input())
    nvips.append(a-1-k)
    k = a
nvips.append(N-k)

max = max(nvips)
m = [1,1,2,3]
for i in range(4,max+1):
    m.append(m[i-2]+2*m[i-3])
result = 1
for nvip in nvips:
    result *= m[nvip]

print(result)