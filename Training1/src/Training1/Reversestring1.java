package Training1;

import java.util.Scanner;

public class Reversestring1 {
 
	public void reverstring2(String s)
	{
		String s2 = "";
	String s1[]=s.split(" ");
	int len = s1.length;
	//System.out.println(s1[0]);
	for(int i=len-1; i>=0; i--)
	{
		
		s2 = s2+s1[i]+" ";
		
	}
	System.out.println(s2);
//	System.out.println( );
	//System.out.println(s1[3] + " " + s1[2] + " " + s1[1] + " " + s1[0] );
	}
	public static void main(String[] args) {
		Reversestring1 obj = new Reversestring1();
		System.out.println( "enter the string");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		obj.reverstring2(s);
		in.close();
		
	}
}
