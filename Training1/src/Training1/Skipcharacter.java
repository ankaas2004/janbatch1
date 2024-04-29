package Training1;

import java.io.InputStream;
import java.util.Scanner;

public class Skipcharacter {
	
	
	public void skipcharacter1() 
	{
	
	String str="Javaa", rev="";
	int len = str.length();
			
	for(int i=0;i<len; i++)
	{
		if(str.charAt(i)!= 'a' )
		{
		
			rev = rev+str.charAt(i);
			
		}
		
	}
	System.out.println(rev);
	
	}
	public void skipchararcter2(String s3)
	{
	String str ="Javaa",s2="",s;
	s=s3;
	
	int len = str.length();
	
	
	for(int i=0;i<len; i++)
	{
		
		//if(!s2.(String.valueOf(s.charAt(0)))) {
			System.out.println(s2);
    		s2=s2+str.charAt(i);
			
		}
		
	}
	//System.out.println(s2);
	
	//}
	
	
	public static void main(String[] args) {
		Skipcharacter obj = new Skipcharacter();
		//String a = null;
		obj.skipcharacter1();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string which need to remove");
		String s3 = scan.next();
		obj.skipchararcter2(s3);
		scan.close();
	}
	}

