import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class g2217 {

	public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				int n;
				n = input.nextInt();
				
				Integer [] arr = new Integer[n];
				for(int i = 0; i < n; i++)
					arr[i] = input.nextInt();
				Arrays.sort(arr, Collections.reverseOrder());
				int k = 0;
				for(int i = 1; i <= n; i++) {
					 k = Math.max(k, arr[i-1]*i);
				}
				System.out.print(k);
			}
	}
