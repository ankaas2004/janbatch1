package Testing;

public class conditionwithloop {
	
	public void conditionwithloop1(int i) {
		
	
		for(i=1;i<=5;i++)
	
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
			
	}
	public static void main(String[] args) {
		
		conditionwithloop obj = new conditionwithloop();
		obj.conditionwithloop1(4);
	}
}
