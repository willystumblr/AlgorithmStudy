#백준 12904
package _12904;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		String T = scanner.nextLine();
		String ch;
		Deque<String> queue = new LinkedList<String>();
		for(int i=0;i<T.length();i++)
		{
			ch = Character.toString(T.charAt(i));
			queue.add(ch);
		}
		int d=0;
		int num1=0,num2=0;
		for(int j=0;j<T.length()-S.length();j++)
		{
			if(d%2==0)
			{
				if(T.charAt(T.length()-1-num1)=='A')
				{
					queue.removeLast();			
				}
				else
				{
					queue.removeLast();
					d++;
				}
				num1++;
			}
			else
			{
				if(T.charAt(num2)=='A')
				{
					queue.removeFirst();
				}
				else
				{
					queue.removeFirst();
					d++;
				}
				num2++;
			}
		}
		System.out.print(num1+" "+num2);
		String T1="";
		for(int i=0;i<S.length();i++) {
			if(d%2==0)
			{
				T1 += queue.pollFirst();
			}
			else {
				T1 += queue.pollLast();
			}
		}
		System.out.print(T1);
		if(T1.compareTo(S)==0)
		{
			System.out.print("1");
		}
		else
		{
			System.out.print("0");
		}
	}
}
