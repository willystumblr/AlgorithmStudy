#4811 - 다이나믹 프로그래밍(카탈린 수)
package _백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4811 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long[] array = new long[31];
		array[0]=1;
		for(int j=1;j<=30;j++)
		{
			for(int i=0;i<j;i++) {
				array[j] += array[i]*array[j-i-1];
			}
		}
		while(true)
		{
			int N = Integer.parseInt(bf.readLine());
			if(N==0) {
				break;
			}
			System.out.println(array[N]);
		}
	}
}
