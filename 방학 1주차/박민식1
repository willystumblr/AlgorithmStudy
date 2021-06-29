import java.util.Arrays;
import java.util.Scanner;

public class 모험가길드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n =input.nextInt();
		int [] group = new int [n];
		for (int i=0; i<n; i++) {
			group[i]= input.nextInt();
		}
		Arrays.sort(group);
		int count=0;
		int gcount=0;
		for (int i=0; i<n; i++) {
			count++;
			if (group[i]<=count) {
				gcount++;
				count=0;
			}
		}
		System.out.print(gcount);
	}

}
