import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class g1260 {
	static int node[][];
	static int count[];
	public static void dfs(int start) {
		count[start]=1;
		System.out.print(start + " ");
		for (int i=0; i<node.length; i++) {
			if(node[start][i]==1 &&count[i]==0) {
				dfs(i);
			}
		}
		
	}
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start);
		count[start]=1;
		System.out.print(start + " ");
		while(!queue.isEmpty()) {
			int x = queue.poll();
		
		for(int i=1;i<node.length;i++) { 
			if(node[x][i]==1 && count[i]!=1) {
				queue.offer(i);
				count[i]=1;
				System.out.print(i + " ");
		
	}
		}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int v = input.nextInt();
		node = new int[n+1][n+1];
		count = new int [n+1];
		for(int i=0; i<n+1; i++) {
			Arrays.fill(node[i], 0);
		}
		for (int i=0; i<m; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			node[a][b]=1;
			node[b][a]=1;
		}
		dfs(v);
		System.out.println();
		Arrays.fill(count, 0); //dfs에서 방문한 노드들 초기화!!
		bfs(v);
	}

}
