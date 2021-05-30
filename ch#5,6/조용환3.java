#2225번
package _백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2225 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] cut = bf.readLine().split(" ");
		int N =Integer.parseInt(cut[0]);
		int K =Integer.parseInt(cut[1]);
		long[][] array = new long[201][201];
		for(int i=0;i<201;i++) {
			array[i][1]=1;
		}
		long sum=0;
		long p=0;
		for(int i=1;i<K;i++)
		{
			for(int j=0;j<=N;j++) {
				sum=0;
				for(int k=0;k<=j;k++)
				{
					sum += array[k][i]+array[j-k][i];
				}
				p=sum/2;
				array[j][i+1] = p%1000000000;
			}
		}
		System.out.println(array[N][K]);
		}
}
