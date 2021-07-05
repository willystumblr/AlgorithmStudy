import java.util.Scanner;

public class 실전1주차3번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String n = input.next();
		int sum0=0;
		int sum1=0;
		if(n.charAt(0)=='0') sum0++;
		else sum1++;
		for (int i=1; i<n.length(); i++) {
			if (n.charAt(i)=='1' && n.charAt(i-1) == '0') sum0++;
			if (n.charAt(i)=='0' && n.charAt(i-1)=='1') sum1++;
		}
		
		System.out.print(Math.min(sum0, sum1));
	}

}
