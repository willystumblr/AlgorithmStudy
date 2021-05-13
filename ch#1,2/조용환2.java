#백준 _1464
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1464 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String sol="";
		StringBuilder sb;
		
		if(s.length()==1) {
			sol=s;
		}
		for(int i=1;i<s.length();i++){
			if(s.charAt(i)<=s.charAt(0)){
				sb= new StringBuilder(s.substring(0,i));
				sb.reverse();
				sb.append(s.charAt(i));
				sol = sb.reverse().toString();
				if(i!=s.length()-1){
					s=sb.toString()+s.substring(i+1);
				}
			}
			else {
				sol=s.substring(0,i+1);
			}
		}
		System.out.println(sol);
	}
}
