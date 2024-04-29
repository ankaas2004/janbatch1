package Training1;

public class Runtimepolymorphism1 extends  Runtimepolymorphism {

	public void athermetic(int a, int b)
	{
	int c;
	c= a-b;
	System.out.println("reuslt "+ c);
	}

	
public static void main(String[] args) {
	
	Runtimepolymorphism1 obj = new Runtimepolymorphism1();
	//obj.athermetic(4,6);
	obj.athermetic(4, 3);
}
	}


