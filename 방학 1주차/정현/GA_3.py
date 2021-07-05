import time
S = input()
start = time.time()
count = 0
if S[0] == '0':
    k = 1
else :
    k = 0

for i in range(len(S)-1):
    if S[i] != S[i+1]:
        if int(S[i+1]) == k:
            count += 1
print(count)
end = time.time()
print(end-start)