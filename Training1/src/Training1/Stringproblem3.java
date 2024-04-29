package Training1;

import java.util.Scanner;

public class Stringproblem3 {
	
	///1010101010----------------------1111100000 
	public void stringproblem3()
	{
		String s1,s2,s3 ="";
		s1 = "1010101010";
		int len = s1.length(), count1 =0, count2=0;
		StringBuilder input = new StringBuilder();
		for(int i = 0; i<10; i++)
		{
			if((s1.charAt(i))=='1')
			{
				count1 = count1 +1;
			}
		}
		for(int k = 0; k<10; k++)
		{
			if((s1.charAt(k))=='0')
			{
				count2 = count2 +1;
			}
		}
		for(int j=0;j<count1;j++)
		{
			input.append(1);
			
		}
		for(int l=0;l<count2;l++)
		{
			input.append(0);
			
		}
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(input);
	}
	public static void main(String[] args)
	{
		Stringproblem3 obj = new Stringproblem3();
		obj.stringproblem3();
		
	}
	
	

}
