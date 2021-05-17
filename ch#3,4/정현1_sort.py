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

#1 매우 나쁜 알고리즘, 시간복잡도 = O(N^4)

for i in range(N):
    for j in range(N):
        for k in range(N):
            for l in range(N):
                count += 1

#2 Counter 클래스 사용하여 풀이, 시간복잡도 O(3*N^2+1) = O(3*N^2 + N^2)
AB = []
CD = []
for i in range(N): #O(N^2)
    for j in range(N):
        AB.append(A[i]+B[j])
        CD.append(C[i]+D[j])
cntAB = Counter(AB) #O(N^2)
cntCD = Counter(CD) #O(N^2)

for key in cntAB.keys(): #O(1) ~ O(N^2)
    if cntCD.get(-key): 
        count += cntAB[key]*cntCD[-key]


#3 4개의 배열을 두 개의 배열로 묶어줌, 딕셔너리 자료구조 이용, 시간복잡도 = O(3*N^2) = O(N^2)

AB = {}
CD = {}
for a in A: #O(N^2)
    for b in B:
        if (a+b) in AB:
            AB[a+b]+=1
        else :
            AB[a+b]=1

for c in C: #O(N^2)
    for d in D:
        if (c+d) in sumCD:
            CD[c+d]+=1
        else :
            CD[c+d]=1

for key in AB.keys(): #O(N^2)
    if CD.get(-key): #get의 시간복잡도는 O(1)
        count += AB[key]*CD[-key]

#4 binary search 이용,

AB = []
CD = []

for i in range(N):
    for j in range(N):
        AB.append(A[i] + B[j])
        CD.append(C[i] + D[j])
CD.sort() #O(NlogN) ==> O(N^2logN)

for i in range(N*N): #O(N^2logN)
    left=0; right=N*N
    while(left<right):
        mid = (left+right)//2
        if AB[i]+CD[mid] < 0:
            left = mid + 1
        else:
            right = mid
    lower_bound = right
    
    left=0; right=N*N
    while(left<right):
        mid = (left+right)//2
        if AB[i]+CD[mid] <= 0:
            left = mid + 1
        else:
            right = mid
    upper_bound = right

    count += upper_bound - lower_bound
    
# print count
print(count)
