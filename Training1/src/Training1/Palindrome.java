package Training1;

import java.util.Scanner;

public class Palindrome {
	
	public void palindrome1(String s) {
		
		String s2="";
		int len = s.length();
		System.out.println(len);
		for(int i=len-1;i>=0;i--)
		{
			System.out.println(s2);
			s2=s2+s.charAt(i);
			
		}

		if (s.equals(s2)) 
		{
			System.out.println("Palindrome");
		}else
		
			System.out.println("not Palindrome");
		
	}

	public static void main(String[] args) {
		Palindrome obj = new Palindrome();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s1= scan.next();
		obj.palindrome1(s1);
	scan.close();
	}
}
