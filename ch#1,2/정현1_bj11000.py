import sys
import heapq

N = int(input())
ST = []
heap = []

for i in range(N):
    ST.append(list(map(int,sys.stdin.readline().split())))

ST.sort(key = lambda x:(x[0]))

heapq.heappush(heap,ST[0][1])

for i in range(1,N):
    if heap[0] > ST[i][0]:
        heapq.heappush(heap,ST[i][1])
    else:
        heapq.heappop(heap)
        heapq.heappush(heap,ST[i][1])

print(len(heap))
