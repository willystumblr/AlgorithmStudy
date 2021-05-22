#백준 7576
import sys
from collections import deque
M, N = map(int, input().split())
queue = deque([]) 
box = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]



dx = [0,0,-1,1]
dy = [-1,1,0,0]

for i in range(N):
    for j in range(M):
        if box[i][j] == 1:
            queue.append([i,j])

def bfs():
    day = -1
    while queue:
        day+=1
        for _ in range(len(queue)):
            x, y = queue.popleft()
        
            for i in range(4):
                nx = x + dx[i]
                ny = y + dy[i]

                if (0<= nx < N) and (0<= ny < M) and box[nx][ny] == 0:
                    box[nx][ny]=box[x][y] + 1
                    queue.append([nx, ny])

    for i in range(N):
        for j in range(M):
            if box[i][j] == 0:
                return -1
    return day

print(bfs())
