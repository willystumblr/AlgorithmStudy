N = input()
findN = N.find('0')
multi=1;
for i in range(len(N)) :
    if int(N[i])!= 0 :
        multi*=int(N[i])
    else :
        multi*=1

print(multi)
