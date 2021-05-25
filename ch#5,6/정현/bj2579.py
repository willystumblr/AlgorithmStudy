N = int(input())
d = [0 for i in range(301)]
m = [0 for i in range(301)]
for i in range(N):
    d[i+1] = int(input())

m[1] = d[1]
m[2] = d[1]+d[2]
m[3] = max(d[1]+d[3],d[2]+d[3])

for i in range(4,N+1):
    m[i] = max(m[i-3]+d[i-1]+d[i],m[i-2]+d[i])

print(m[N])