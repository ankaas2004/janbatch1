package Training1;

public class Reversesrting {

	public static void main(String[] args) {
		String str="ABCD",rev= "",rev1="";
		int len = str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		
		}
		System.out.println("reverse string "+ rev);
		
		//------ Char array
		char a[]=str.toCharArray();
		for(int i=len-1;i>=0;i--)
		{
			rev1 = rev1+a[i];
		
		}
		System.out.println("reverse string with array "+ rev1);
		
		// string buffer class
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println("reverse the strung with string buffer class " + sb.reverse());
	}

}
