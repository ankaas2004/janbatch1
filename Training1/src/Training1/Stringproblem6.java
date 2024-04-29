package Training1;

import java.util.Scanner;

public class Stringproblem6 {
	
	//my name is deepak-------------ym enam si kapeed
	
	public void stringproblem6(String s)
	{
		//String[] s1=s.split(" ");
		String s2="",s3="";
		int len = s.length();
		for(int i=len-1;i>=0;i--)
		{
			
			s2=s2+s.charAt(i);
		}
		String[] s4=s2.split(" ");
			int len1 = s4.length;
			for(int j=len1-1;j>=0;j--)
			{
				s3=s3+s4[j]+" ";
			}
		System.out.println(s3);
	}
	public static void main(String[] args) {
		Stringproblem6 obj = new Stringproblem6();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = scan.nextLine();
		obj.stringproblem6(s);
		scan.close();
	}
}
