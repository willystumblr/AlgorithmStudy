import sys

N,M= map(int,sys.stdin.readline().split())
H = list(map(int,sys.stdin.readline().split()))
sumH = sum(H)

k1 = (M-sumH-N)//(N+1)
k2 = (M-sumH-N)%(N+1)

result=0
if (M-sumH-N)>0:
    for i in range(N+1):
        if i < k2:
            for j in range(k1+1):
                result+=(j+1)**2
        else:
            for j in range(k1):
                result+=(j+1)**2

print(result)