import java.util.Arrays;
import java.util.Scanner;

public class 실전1주차5번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int []array= new int [n];
		for (int i=0; i<n; i++) {
			array[i]= input.nextInt();
		}
		Arrays.sort(array,1,n);
		int count =0;
	for (int i=0; i<n; i++) {
		for (int j=i+1; j<n; j++) {
			if (array[i]<array[j]) {
				count++;
			}
		}
	}
	System.out.print(count);
	}
}
