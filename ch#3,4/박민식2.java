import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class g2644 {
	static int node[][]; // 입력받은 연결
	static int check[];
	static int count[];// 들린곳
	static void bfs(int a, int b) { // BFS 메소드
		Queue<Integer> queue = new LinkedList<>();
		check[a] =1;
		queue.offer(a);
		while(!queue.isEmpty()) {
			int x = queue.poll();
			if (x==b) {
				break;
			}
		for (int i=1; i<node.length; i++) {
			if(node[x][i]==1 && check[i]!=1) {
				queue.offer(i);
				check[i] = 1;	
				count[i]= count[x]+1;
		}
	}
			}
		if (count[b]==0) {
			System.out.printf("-1");
		}
		else {
			System.out.print(count[b]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a = input.nextInt();
		int b = input.nextInt();
		int m = input.nextInt();
		node = new int [n+1][n+1];
		check = new int [n+1];
		count = new int [n+1];
		for (int i=0; i<n+1; i++) {
			Arrays.fill(node[i], 0);
			Arrays.fill(check, 0);
			Arrays.fill(count, 0);
		}
		for (int i = 0; i<m; i++) {
			int x = input.nextInt();
			int y = input.nextInt();
			node[x][y]=1;
			node[y][x]=1;
		}
		bfs(a, b);
	}

}
