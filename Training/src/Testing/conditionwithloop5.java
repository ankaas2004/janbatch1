package Testing;

public class conditionwithloop5 {
	
	public void conditionwithloop7(int i) {
		
		
		for(i=5;i>=5;i--)
	
		{
			for (int j=1;j>=5;j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
			
	}
	public static void main(String[] args) {
		
		conditionwithloop5 obj = new conditionwithloop5();
		obj.conditionwithloop7(4);
	}

}
