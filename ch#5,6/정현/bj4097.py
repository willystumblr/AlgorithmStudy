while True:
    N = int(input())
    if(N==0): break
    d = [int(input())]
    for i in range(1,N):
        k = int(input())
        d.append(max(d[i-1]+k,k))
    print(max(d))