package _백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _16194 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(bf.readLine());
		int[] prices = new int[M+1];
		int[] numbers = new int[M+1];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=1;i<=M;i++)
		{
			numbers[i]=prices[i] =Integer.parseInt(st.nextToken());
		}
		int min;
		for(int i=1;i<=M;i++){
			min=10001;
			for(int j=0;j<=i;j++) {
				int k = numbers[i-j]+numbers[j];
				if(min>k)
				{
					min=k;
				}
			}
			numbers[i]=min;
		}
		System.out.println(numbers[M]);
	}
}
