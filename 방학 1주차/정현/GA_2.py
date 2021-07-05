data = input()
result = int(data[0])

for i in range(1,len(data)):
    k = int(data[i])
    if result <= 1:
        result += k
    else :
        if k<=1:
            result += k
        else:
            result *=k

print(result)
