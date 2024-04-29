package Training1;

import java.util.Scanner;
///my name is deepak-----------occurence of character e here 
public class Stringproblem2 {

	public void stringproblem2(String s1, String s2) {
		
		
		int len=s1.length(), count=0;
		for (int i =0; i<len; i++)
		{
			if((s1.charAt(i)) == (s2.charAt(0)))
			{
				count= count + 1;
			}
		}
		System.out.println("Occurance of " + s2+ " " + count);
	}
	
	public static void main(String[] args) {
		Stringproblem2 obj = new Stringproblem2();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s3 = scan.nextLine();
		System.out.println("find the occurance " );
		String s4 = scan.nextLine();
		obj.stringproblem2(s3, s4);
		scan.close();
	}
}
