import java.util.Scanner;

public class g11057 {
	static int dp[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		dp = new int [n+1][10];
		for (int i=0; i<10; i++) {
			dp[1][i]=1;
		}
		int sum = 0;
		for (int i=2; i<n+1; i++) {
			for (int j=0; j<10; j++) {
				for (int k=0; k<=j; k++) {
					dp[i][j] += dp[i-1][k];
					dp[i][j] %=10007;
				}
			}
		}
		for (int i=0; i<10; i++) {
			sum += dp[n][i];
		}
		sum %= 10007;
		System.out.print(sum);
	}

}
