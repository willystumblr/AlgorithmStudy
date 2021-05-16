import java.util.Scanner;

public class g4796 {
	static int l, p, v;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int day=0;
		while (true) {
		l = input.nextInt();
		p = input.nextInt();
		v = input.nextInt();
		if (l==0) {
			break;
		}
		int a, b;
		a = v/p;
		b = v%p;
		int sum;
		if (l>b) {
			sum = a*l+b;
			day++;
		}
		else {
			sum = a*l+l;
			day++;
		}
		System.out.println("Case " + day + ": " + sum);
	}
	}
}
