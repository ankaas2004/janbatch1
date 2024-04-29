package Training1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

///1010101010----------------------1111100000 

public class Stringproblem5 {
	
	public void stringproblem5(String s) {
		
		
		char tempArray[] = s.toCharArray();
		Arrays.sort(tempArray);
		String s1= new String(tempArray);
		String s2="";
		int len =s1.length();
		for(int i=len-1;i>=0;i--)
		{
			s2= s2+s1.charAt(i);
		}
		System.out.println(s2);
	}

	public static void main(String[] args) 
	{
		Stringproblem5	obj = new Stringproblem5();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = scan.nextLine();
		obj.stringproblem5(s1);
		scan.close();
	}
}
