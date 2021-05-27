import java.util.Scanner;

public class g1944 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int num[] = new int [1000001];
        num[0]=0;
		num[1]=1;
		num[2]=2;
		for (int i=3; i<1000001; i++) {
			num[i]=(num[i-1]+num[i-2])%15746;
		}
		System.out.print(num[n]);
	}

}
