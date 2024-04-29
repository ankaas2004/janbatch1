package Training1;

import java.util.Scanner;

public class TestOccuranceOfACharacter {
	
	@SuppressWarnings("unlikely-arg-type")
	public void testOccuranceOfACharacter1(String s1, String s2) {
		
		int len = s1.length();
		int count=0;
		for (int i=0;i<=len-1;i++)
		{
			
			if( (s1.charAt(i))==(s2.charAt(0)))
			{
			
				count ++;
			}
			
		}
		System.out.println("count " + count);
	}
 public static void main(String[] args) {
	TestOccuranceOfACharacter obj = new TestOccuranceOfACharacter();
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the string");
	String s1 = scan.next();
	System.out.println("enter the character");
	String s2 = scan.next();
	obj.testOccuranceOfACharacter1(s1,s2);
	scan.close();
 }
}
