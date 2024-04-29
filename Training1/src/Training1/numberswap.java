package Training1;

public class numberswap {

	public void numberswap1()
	{
	int a=10,b=20,c;
	
	//--with 3rd variable
	c=a+b;
	b=c-b;
	a=c-a;
	System.out.println("result with 3rd varilable " + a + " ; " + b);
	
	//without 3rd variable
	int d=10,e= 20;
	e=d+e;
	d=e-d;
	e= e-d;
	System.out.println("result with 3rd varilable " + d + " ; " + e);
	
	//with * and /
	int f=10,g= 20;
	g=f*g;
	f=g/f;
	g=g/f;
	System.out.println("result with * and / " + f + " ; " + g);	
	
	// single statement
	int h=10,i=20;
	i=h+i-(h=i);
	System.out.println("result in single statement " + h + " ; " + i);
	}
	public static void main(String[] args) {
		numberswap obj = new numberswap();
		obj.numberswap1();
	}
}
