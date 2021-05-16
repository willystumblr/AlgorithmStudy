import sys

N = int(input())
rcomndNum = int(input())
rcomndList = list(map(int,sys.stdin.readline().split()))

cand = []
def exist(new,cand):
    for i in range(len(cand)):
        if new == cand[i][0]:
            return i
    return -1

for i in range(rcomndNum):
    min = 1001
    new = rcomndList[i]
    k = exist(new,cand)
    if k>=0: # 추천받은 후보의 번호가 사진틀 내에 있을 때
        cand[k][1] +=1
    else: # 추천받은 후보의 번호가 사진틀 내에 없을 때
        if len(cand) == N: # 사진틀이 전부 채워져있을 때
            for i in range(N):
                if cand[i][1] < min:
                    min = cand[i][1]
                    minOne = i
            cand.remove(cand[minOne])
        cand.append([new,1])

cand = sorted(cand, key = lambda x : x[0])
for i in range(len(cand)):
    print(cand[i][0],end=" ")
