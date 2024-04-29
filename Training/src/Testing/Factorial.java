package Testing;

public class Factorial {

	public void factorial1(int n) {
		
		int i, j = 1;
		for(i=1;i<=n;i++)
		{
			j = i*j;
			
		}
		
			System.out.println("Factorial of " + n + " is: " + j);
		
	}
	public static void main(String[] args) {
		
		Factorial obj = new Factorial();
		obj.factorial1(3);
		
	}
}
