#2644
package _백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _2644 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		String s =bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(bf.readLine());
		int[][] array = new int[N+1][N+1];
		boolean[] check = new boolean[N+1];
		int[] number = new int[N+1];
		for(int i=0;i<M;i++)
		{
			String[] split = bf.readLine().split(" ");
			int k1 = Integer.parseInt(split[0]);
			int k2 = Integer.parseInt(split[1]);
			array[k1][k2]=1;
			array[k2][k1]=1;
		}
		Queue<Integer> queue = new LinkedList<>();
		number[x]=0;
		for(int i=1;i<N+1;i++)
		{
			if(array[x][i]==1) //연결된 친구가 true가 아니라 queue i가 true가 되야됨.
			{
				check[x]=true;
				number[i]=1;
				queue.add(i);
			}
		}
		while(!queue.isEmpty())
		{
			int count =1;
			int k = queue.poll();
			check[k] = true;
			for(int i=1;i<N+1;i++)
			{
				if(check[i]==false && array[k][i]==1)
				{
					number[i] = number[k]+1;
					queue.add(i);
				}
			}
		}
		if(number[y]==0)
		{
			System.out.println(-1);
		}
		else {
			System.out.println(number[y]);
		}
	}
}
