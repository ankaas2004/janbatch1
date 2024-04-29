package Training1;

import java.util.Scanner;

public class Reversestring4 {
	
	public void reversestting5(String s) {
		String s1="";
		String s2[]=s.split(" ");
		int len =s2.length;
		StringBuilder input = new StringBuilder();
		for (int i =0;i<len;i++)
		{
			int len1 = s2[i].length();
			
			for (int j= len1; j>0;j--)
			{
				input.append(s2[j]);
				input.reverse();
			}
			
			
		}
		System.out.println(input);
				
		
	}
	public static void main(String[] args) {
		Reversestring4 obj = new Reversestring4();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s3=scan.nextLine();
		obj.reversestting5(s3);
		scan.close();
		
	}

}
