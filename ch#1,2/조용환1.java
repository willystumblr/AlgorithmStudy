#_11497
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11497 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		for(int i=0;i<N;i++)
		{
			int M = Integer.parseInt(bf.readLine());
			int[] array = new int[M]; //담을 array
			String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			for(int k=0;k<M;k++)
			{
				array[k]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(array);
			int[] sort = new int[M]; //sorting하고 배열할 array
			int p;
			for(int k=0;k<M;k++)
			{
				if(k%2==0)
				{
					p=k/2;
					sort[p]=array[k];
				}
				else {
					p=k/2;
					sort[M-1-p]=array[k];
				}
			}
			int Max = sort[M-1]-sort[0];
			for(int k=0;k<M-1;k++)
			{
				if(Max<Math.abs(sort[k]-sort[k+1]))
				{
					Max = Math.abs(sort[k]-sort[k+1]);
				}
			}
			System.out.println(Max);
		}
	}
}
