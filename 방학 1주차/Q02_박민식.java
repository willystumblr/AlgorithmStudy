import java.util.Scanner;

public class 실전1주차2번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int array[] = new int [20];
		int i = 0;
		for (int j=0; j<20; j++) {
			array[j]=0;
		}
		while (n>=1) {
			array[i]=n%10;
			n=n/10;
			i++;
		}
		int sum=0;
		for (int j=0; j<i; j++) {
			if (array[j] !=1 && array[j]!=0) {
				if (sum !=0) sum*=array[j];
				else sum=array[j];
			}
			else {
				sum+=array[j];
			}
		}
		System.out.println(sum);
		
	}

}
