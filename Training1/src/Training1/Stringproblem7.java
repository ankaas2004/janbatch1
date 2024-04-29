package Training1;

import java.util.Scanner;

public class Stringproblem7 {
	//my name is deepak------------kapeed si eman ym
	public void stringproblem7(String s) {
		
		String s1="";
		int len = s.length();
		for(int i =len-1;i>=0;i --)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
	}
	public static void main(String[] args) {
		Stringproblem7 obj = new Stringproblem7();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s = scan.nextLine();
		obj.stringproblem7(s);
		scan.close();
	}
}
