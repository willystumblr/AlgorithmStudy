package _백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11687 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 int M = Integer.parseInt(bf.readLine());
		 int start=0,end=1000000000;
		 int ans=-1;
		 while(start<=end) {
			 int mid=(start+end)/2;
			 int cnt=0;
			 for(int i=5;i<=mid;i*=5) {
				 cnt+=mid/i;
			 }
			 if(cnt>=M) {
				 end = mid-1;
				 if(cnt==M)
				 {
					 ans = mid;
				 }
			 }
			 else {
				 start= mid+1;
			 }
		 }
		 System.out.println(ans);
		 
	// 몇번 지수 곱했는지 알수 있음
	/*public static int pow(int a,int b) {
		if(a==b)
		{
			return 1;
		}
		else if((int)Math.sqrt(a)%b==0)
		{
			int n = pow((int)Math.sqrt(a),b);
			return n+n;
		}
		else {
			a=a/b;
			int n = pow((int)Math.sqrt(a),b);
			return 1+n+n; 
		}
	}*/
	}
}
