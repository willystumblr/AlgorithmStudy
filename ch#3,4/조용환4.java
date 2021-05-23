package _백준; -2548번입니다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2548 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[] array = new int[N];
		String[] str = bf.readLine().split(" ");
		int sum = 0;
		for(int i=0;i<N;i++)
		{
			array[i] = Integer.parseInt(str[i]);
			sum+=array[i];
		}
		Arrays.sort(array);
		int p=0,check=0;
		int Min = sum;
		for(int i=0;i<=array[N-1];i++)
		{
			p=0;
			for(int j=0;j<N;j++)
			{
				p += Math.abs(array[j]-i);
			}
			if(Min>p)
			{
				Min=p;
				check=i;
			}
			else if(Min==p){
				continue;	
			}
			
		}
		System.out.println(check);
	}
}
