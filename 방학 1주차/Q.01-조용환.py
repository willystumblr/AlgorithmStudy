N = int(input())
data = list(map(int,input().split()))
data.sort()
check=0
result=0
for i in range(len(data)) :
    val = data[i]
    check += 1
    if val == check :
        result +=1
        count =0
print(result)
