package Training1;

import java.util.Scanner;

public class Stringproblem 
{

		 ///mynameisdeepak--------------my$name$is$deepak
		public void stringproblem1(String s)
		{
			String s2 = "";
		String s1[]=s.split(" ");
		int len = s1.length;
		//System.out.println(s1[0]);
		for(int i=0; i<len; i++)
		{
			
			
			if(i<len-1)
			{
				s2 = s2+s1[i]+"$";
			}else
				s2=s2+s1[i];
			
		}
		System.out.println(s2);
//		System.out.println( );
		//System.out.println(s1[3] + " " + s1[2] + " " + s1[1] + " " + s1[0] );
		}
		public static void main(String[] args) {
			Stringproblem obj = new Stringproblem();
			System.out.println( "enter the string");
			Scanner in = new Scanner(System.in);
			String s = in.nextLine();
			obj.stringproblem1(s);
			in.close();
			
		}
	}


