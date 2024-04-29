package Training1;

public class CompliePolymorphism // method overloading
	{
	public void sum()
	{
	int a,b,c;
	a=3;
	b=2;
	c=a+b;
	System.out.println("result "+ c);
	}
	public void sum(int a, int b)
	{
	int d;
	d=a+b;
	System.out.println("result " + d);
	}
	public void sum(int a,int b, int c) 
	{
	int e;
	e=a+b+c;
	System.out.println("result " + e );
	}

	public static void main(String[] args) {
		CompliePolymorphism obj = new CompliePolymorphism();
		obj.sum();
		obj.sum(2, 4);
		obj.sum(2, 3, 4);
	}
	}
  


