package Training1;

import java.util.Scanner;

public class Stringproblem4 {
	///my name is deepak my name ----occurence of word my here 
	public void stringproblem4(String s, String s1)
	{
		//String s1= "my";
		String[] s2 = s.split(" ");
		int len = s2.length, count = 0;
		for(int i =0; i<len ; i++)
		{
			if(s1.equals(s2[i]))
			{
				count = count +1;
			}
						
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Stringproblem4 obj = new Stringproblem4();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = scan.nextLine();
		System.out.println("enter the word");
		String s1 = scan.next();
		obj.stringproblem4(s,s1);
		scan.close();
	}
}
