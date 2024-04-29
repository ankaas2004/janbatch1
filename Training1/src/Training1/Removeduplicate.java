package Training1;

import java.util.Scanner;

public class Removeduplicate {
	
	public void removeduplicate(String s1)
	{
		
	String s="";	 
	int len = s1.length();
	for ( int i =0;i<=len-1;i++)
	{
		if(!s.contains(String.valueOf(s1.charAt(i))))
		{
			s=s+s1.charAt(i);
		}
	}
	System.out.println(s);
	}
public static void main(String[] args) {
	Removeduplicate obj = new Removeduplicate();
	String s3="";
	Scanner s2 = new Scanner(System.in);
	System.out.println("enter the string");
	s3=s2.nextLine();
	obj.removeduplicate(s3);
	s2.close();
}
}
