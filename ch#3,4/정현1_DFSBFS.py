## 백준 1260번 DFS와 BFS

from collections import deque

N,M,V = map(int,input().split())

graph = [[] for _ in range(N+1)]
for i in range(M):
    s,t = map(int,input().split())
    graph[s].append(t)
    graph[t].append(s)

visited = [False]*(N+1)

def dfs(graph,v,visited) :
    visited[v] = True
    print(v,end=" ")
    graph[v].sort()
    for node in graph[v]:
        if not visited[node]:
            dfs(graph,node,visited)


def bfs(graph,v,visited):
    que = deque([v])
    visited[v] =True
    while que:
        node = que.popleft()
        print(node,end=" ")
        graph[node].sort()
        for i in graph[node]:
            if not visited[i]:
                que.append(i)
                visited[i] = True


dfs(graph,V,visited)
print()
visited = [False]*(N+1)
bfs(graph,V,visited)