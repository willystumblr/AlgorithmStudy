import java.util.Scanner;

public class g2847 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		n = input.nextInt();
		int [] arr = new int [n];
		for (int i=0; i<n; i++) {
			arr[i] = input.nextInt();
		}
		int count =0;
		for (int i=n-1; i>0; i--) {
			while (true) {
			if (arr[i]<=arr[i-1]) {
				arr[i-1] = arr[i-1]-1;
				count++;
			}
			else {
				break;
			}
		}
	}
		System.out.print(count);
	}
}
