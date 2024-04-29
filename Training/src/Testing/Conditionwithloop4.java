package Testing;

public class Conditionwithloop4 {
	
public void conditionwithloop6(int n) {
		
		int i,j;
		for(i=0;i<=5;i++)
	
		{
				
				for (j=n-i;j>1;--j)
				
				{
					System.out.print(" ");
					
				}
				for (int k=0;k<=i;k++) 
				{
				
				System.out.print("*");
				
				}
				for(int l=1;l<=i;l++)
				{
					System.out.print("*");
				}
			System.out.println("");
		}
			
}
	public static void main(String[] args) {
		
		Conditionwithloop4 obj = new Conditionwithloop4();
		obj.conditionwithloop6(6);
	}

}
