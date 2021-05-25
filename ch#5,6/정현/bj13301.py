N = int(input())
data = [0]*(N+1)
data[1]=1
def fibo(N,data):
    for i in range(2,N+1):
        data[i]=data[i-1]+data[i-2]
    return(data[N])
fibo(N,data)
print(4*data[N]+2*data[N-1])