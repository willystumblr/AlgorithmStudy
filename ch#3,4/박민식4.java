import java.util.Arrays;
import java.util.Scanner;

public class g16678 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int array[]= new int[n];
		for (int i=0; i<n; i++) {
			array[i]= input.nextInt();
		}
		Arrays.sort(array);
		int count =0;
		if (array[0]!=1) {
			for (int i=0; i<n-1; i++) {
				count += array[i]-i-2;
			}
			count+=array[n-1]-1;
		}
		else {
			for (int i=0; i<n; i++) {
				count += array[i]-i-1;
			}
		}
		System.out.print(count);
		
	}

}
