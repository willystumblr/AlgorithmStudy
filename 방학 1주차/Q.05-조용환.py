N,M = map(int,input().split())
array = list(map(int,input().split()))
arr = []
for i in range(1,M+1) :
    count=0
    for k in array :
        if i==k :
            count+=1
    arr.append(count)
result = int(N*(N-1)/2)
for k in arr :
    if k>1 :
        result-=(k-1)

print(result)
