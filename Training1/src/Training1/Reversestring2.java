package Training1;

import java.util.Scanner;

public class Reversestring2 {
	
	public void reversestring3(String s) {
		String s2="";
		String s3[]=s.split(" ");
		int len = s3.length;
		System.out.println(s2);
		for(int i=len-1;i>=0;i--)
		{
			s2=s2+s3[i]+" ";
			
		}
		System.out.println(s2);
	}

	 public static void main(String[] args) {
		Reversestring2 obj =new Reversestring2();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = scan.nextLine();
		obj.reversestring3(s1);
		scan.close();
	}
}
