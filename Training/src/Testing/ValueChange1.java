package Testing;

public class ValueChange1 {
	
	public void valuechange_2() 
	
	{
	int a,b;
	a= 2;
	b =3;
	int c=a+b;
	a=c-a;
	b=c-a;
	System.out.println("value of " + a);
	System.out.println("value of" + b);
	
	
	}
	public static void main(String[] args) 
	{
	
		ValueChange1 obj=new ValueChange1();
		obj.valuechange_2();
	}
}
