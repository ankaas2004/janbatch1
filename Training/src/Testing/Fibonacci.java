package Testing;

public class Fibonacci {
	
	public void fibonacci1(int n) {
		
		int i, j,k,l;
		i=0;
		j=1;
		System.out.print(i +" "+j);
		for(l=2;l<n;++l)
		{
			
			k=i+j;
			System.out.print(" "+k);
			i=j;
			j=k;
		}
	
	
		
	}
	public static void main(String[] args) {
		Fibonacci obj = new Fibonacci();
		obj.fibonacci1(12);
	}

}
