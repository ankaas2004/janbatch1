package Testing;

public class conditionwithloop2 {
	
public void conditionwithloop4() {
		
		int i,j=5;
		for(i=1;i<=5;i++)
	
		{
				
				for (j=5;j>=i;--j)
				
				{
					System.out.print(" ");
					
				}
				for (int k=1;k<=i;k++) 
				{
				System.out.print("*");
				}
			System.out.println("");
		}
			
	}
	public static void main(String[] args) {
		
		conditionwithloop2 obj = new conditionwithloop2();
		obj.conditionwithloop4();
	}

}
