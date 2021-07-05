N, M = map(int,input().split())
data = list(map(int,input().split()))
result = int(N*(N-1)/2)

for i in range(10):
    k = data.count(i+1)
    if k>1:
        result -= int(k*(k-1)/2)

print(result)