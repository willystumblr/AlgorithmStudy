N = int(input())

data = [1]

for i in range(1,N+1):
    x = 0
    for j in range(i):
        x += data[j]*data[i-1-j]
    data.append(x)

print(data[N])
