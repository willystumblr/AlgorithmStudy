#백준 1292번(구현)
import java.util.Scanner;

public class _1292 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int count=0;
		for(int i=N;i<=M;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j*(j+1)/2>=i)
				{
					count+=j;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
