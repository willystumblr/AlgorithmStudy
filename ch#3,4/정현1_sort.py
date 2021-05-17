import sys
from collections import Counter

N = int(input())
A = [0 for _ in range(N)]
B = [0 for _ in range(N)]
C = [0 for _ in range(N)]
D = [0 for _ in range(N)]

for i in range(N):
    A[i],B[i],C[i],D[i] = map(int,sys.stdin.readline().split())

count = 0

# 매우 나쁜 알고리즘, 시간복잡도 = O(N^4)

for i in range(N):
    for j in range(N):
        for k in range(N):
            for l in range(N):
                count += 1

# Counter 클래스 사용하여 풀이, 시간복잡도 best = O(N^2) worst = O(N^4)
sumAB = []
sumCD = []
for i in range(N):
    for j in range(N):
        sumAB.append(A[i]+B[j])
        sumCD.append(C[i]+D[j])
cntAB = Counter(sumAB)
cntCD = Counter(sumCD)
for key in cntAB.keys():
    if -key in cntCD.keys():
        count += cntAB[key]*cntCD[-key]


# 4개의 배열을 두 개의 배열로 묶어줌, 딕셔너리 자료구조 이용, 복잡도 = O(N^2)

sumAB = {}
sumCD = {}
for a in A:
    for b in B:
        if (a+b) in sumAB:
            sumAB[a+b]+=1
        else :
            sumAB[a+b]=1

for c in C:
    for d in D:
        if (c+d) in sumCD:
            sumCD[c+d]+=1
        else :
            sumCD[c+d]=1

for key in 

print(count)
