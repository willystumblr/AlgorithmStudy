letters = list(input())

import string as str
alphabet = list(str.ascii_lowercase)
loc = []

for i in range(len(alphabet)):
    for j in range(len(letters)):
        if alphabet[i] == letters[j]:
            loc.append(j)
            break
    if len(loc) != i+1:
        loc.append(-1)   
    print(loc[i], end =' ')


