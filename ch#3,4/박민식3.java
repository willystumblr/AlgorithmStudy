import java.util.Arrays;
import java.util.Scanner;

public class g18870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int array[]= new int[n];
		int cost[]= new int [n-1];
		for (int i = 0; i<n; i++) {
			array[i]= input.nextInt();
		}
		int tmp;
		for (int i=0; i<n-1; i++) {
			cost[i]= array[i+1]-array[i];
		}
		Arrays.sort(cost);
		int sum =0;
		for (int i=0; i<n-m; i++) {
			sum +=cost[i];
		}
		System.out.print(sum);
		}
	}
