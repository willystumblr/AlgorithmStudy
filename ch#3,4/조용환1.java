#백준 7576 속도가 굉장히 느린편이라 이렇게 풀었구나만 보시면 될꺼 
package _백준;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _7576 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = bf.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		int[][] array = new int[M][N];
		for(int i=0;i<M;i++)
		{
			String[] nv = bf.readLine().split(" ");
			for(int j=0;j<N;j++) {
				array[i][j] =Integer.parseInt(nv[j]);
			}
		}
		Queue<Point> queue = new LinkedList<Point>();
		boolean[][] check =new boolean[M][N];
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(array[i][j]==1)
				{
					queue.add(new Point(i,j));
					check[i][j]=true;
				}
			}
		}
		int[] dx = {-1,0,1,0};
		int[] dy = {0,1,0,-1};
		while(!queue.isEmpty()) {
			int x = queue.peek().x;
			int y = queue.peek().y;
			for(int i=0;i<4;i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				if(nx>=M||nx<0||ny<0||ny>=N)
				{
					continue;
				}
				else {
					if(check[nx][ny]==false && array[nx][ny]==0)
					{
						check[nx][ny]=true;
						array[nx][ny]=array[x][y]+1;
						queue.add(new Point(nx,ny));
					}
				}
			}
			queue.poll();
		}
		boolean minus=true;
		int Max = array[0][0];
		for(int i=0;i<M;i++)
		{
			if(minus==false)
			{
				break;
			}
			for(int j=0;j<N;j++)
			{
				if(array[i][j]==0)
				{
					System.out.println(-1);
					minus=false;
					break;
				}
				if(Max<array[i][j])
				{
					Max=array[i][j];
				}
			}
		}
		if(minus==true)
		{
			System.out.println(Max-1);
		}
	}
	/* 위에서 사용한 Point는 다음과 같다고 생각하면 
  public static class Point{
		private int x,y;
		Point(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
	}
	 */	
}
