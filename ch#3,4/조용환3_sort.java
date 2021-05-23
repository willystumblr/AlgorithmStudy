package _백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class _1931 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[][] array = new int[N][2];
		for(int i=0;i<N;i++)
		{
			String[] str = bf.readLine().split(" ");
			array[i][0]=Integer.parseInt(str[0]);
			array[i][1]=Integer.parseInt(str[1]);
		}
		Arrays.sort(array, new Comparator<int[]>() {
		    public int compare(int[] o1, int[] o2) {
		    	if(o1[1]==o2[1]) {
		    		return o1[0]-o2[0];
		    	}
		    	
		    	return o1[1]-o2[1];
		    }
		});//정렬 알고리즘
		int count=1;
		int stand = array[0][1];
		for(int i=1;i<N;i++) {
			if(array[i][0]>=stand) {
				count+=1;
				stand = array[i][1];
			}
		}
		System.out.println(count);
	}
}
