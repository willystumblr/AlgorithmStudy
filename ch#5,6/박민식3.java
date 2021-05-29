import java.util.Scanner;

public class g1699 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int num[]= new int [100001];
		for (int i=1; i<100001; i++) {
			for (int j=1; j*j<=i; j++) {
				if (num[i]>num[i-j*j]+1 || num[i]==0) {
					num[i]= num[i-j*j]+1;
				}
			}
		}
		System.out.print(num[n]);
	}

}
