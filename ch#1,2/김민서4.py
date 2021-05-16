#백준 4796
i=0
while True :
    i+=1
    val = list(map(int, input().split()))
    if val == [0, 0, 0]: 
        break
    answer = (val[2]//val[1])*val[0] + val[2]%val[1] if val[2]%val[1] <= val[0] else (val[2]//val[1])*val[0] + val[0]
    print("Case "+str(i) + ": "+str(answer))
