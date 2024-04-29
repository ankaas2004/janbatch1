package Testing;

public class Valuechange {
	
	public void valuechange_1() 
	
	{
	int a,b;
	a= 2;
	b =3;
	b=a+b;
	a=b-a;
	b=b-a;
	System.out.println(" value of " + a);
	System.out.println("value of" + b);
	
	
	}
	public static void main(String[] args) {
		Valuechange obj = new Valuechange();
		obj.valuechange_1();
	}

}
