S = input()
count=0
for i in range(len(S)-1) :
    if S[i]!=S[i+1]:
        count+=1
if S[0]==S[len(S)-1] :
    print(int(count/2))
else :
    print(int(count/2+1))
