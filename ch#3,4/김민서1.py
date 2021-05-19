#백준 1260
import sys
from collections import deque 

def dfs(start):
    visited[start] = True
    print(start, end = ' ')

    for k in range(1, n+1):
        if not visited[k] and graph[start][k] == 1:
            dfs(k)
def bfs(start):
    queue = deque([start])
    visited_2[start] = True
    while queue:
        elem = queue.popleft()
        print(elem, end = ' ')
        for k in range(1, n+1):
            if not visited_2[k] and graph[elem][k] == 1:
                queue.append(k)
                visited_2[k] = True

n, m, start = map(int, sys.stdin.readline().split())
graph = [[0]*(n+1) for _ in range(n+1)]
visited = [False for _ in range(n+1)]
visited_2 = [False for _ in range(n+1)]
for i in range(m):
    x, y = map(int, sys.stdin.readline().split())
    graph[x][y] = 1
    graph[y][x] = 1

dfs(start)
print()
bfs(start)
