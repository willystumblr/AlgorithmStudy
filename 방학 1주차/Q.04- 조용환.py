N = int(input())
coin = list(map(int,input().split()))
coin.sort(reverse=True)
print(coin)
i=0
check = False
while True :
    i+=1
    k=i
    for j in coin :
        if k==0 :
            break
        if k<j :
            continue
        else :
            k-=j
    if k>0 :
        break
print(i)
