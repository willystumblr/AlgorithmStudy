11726번 다이나믹 프로그래밍 문제
package _백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11726 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(bf.readLine());
		int[] array = new int[M+1];
		array[0]=1;
		array[1]=1;
		for(int i=2;i<=M;i++)
		{
			array[i]=(array[i-1]+array[i-2])%10007;
		}
		System.out.println(array[M]);
	}
}
