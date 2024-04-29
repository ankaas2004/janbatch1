package Training1;

import java.util.Scanner;

public class PalindromeString 
{
	
  public void palindromeString1(String s) 
  {
	
	  String s1="";
	  int len =s.length();
	  for(int i =len-1;i>=0;i--)
	  {
		  s1=s1+s.charAt(i);
		  
	  }
	  if (s1.equals(s))
			  {
		  System.out.println("palindrome");
			  }else
			  
				  System.out.println("not a Paliendrome");
			  }


  public static void main(String[] args) {
	
	  PalindromeString obj = new PalindromeString();
	  Scanner scan = new Scanner(System.in);
	  System.out.println("enter the string");
	  String s=scan.next();
	  obj.palindromeString1(s);
	  scan.close();
}
}
