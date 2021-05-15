from collections import deque
import sys

N = int(input())

K = int(input())
apples = [[0 for i in range(N+1)] for j in range(N+1)]
for i in range(K):
    a,b = map(int,sys.stdin.readline().split())
    apples[a][b] = 1
    

L = int(input())
changes = deque()
for i in range(L):
    x,c = input().split()
    changes.append([int(x),c])

locate = deque([[1,1]])
time = 0
dy = [-1,0,1,0]
dx = [0,1,0,-1]
d=1

while True:
    time += 1
    head = [locate[-1][0]+dy[d],locate[-1][1]+dx[d]]

    if len(changes) > 0:
        if time == changes[0][0]:
            if changes[0][1] =="L":
                d = (d-1)%4
            elif changes[0][1] == "D" :
                d = (d+1)%4
            changes.popleft()

    if (head[0] > N) | (head[0] < 1) | (head[1] > N) | (head[1] < 1):
        break
    if head in locate:
        break
    if apples[head[0]][head[1]] == 1:
        apples[head[0]][head[1]] = 0
        locate.append(head)
    else:
        locate.append(head)
        locate.popleft()
print(time)