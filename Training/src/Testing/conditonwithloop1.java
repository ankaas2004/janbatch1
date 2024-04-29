package Testing;

public class conditonwithloop1 {

	public void conditionwithloop3(int i) {
		
		
		for(i=1;i<=5;i++)
	
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}
			
	}
	public static void main(String[] args) {
		
		conditonwithloop1 obj = new conditonwithloop1();
		obj.conditionwithloop3(4);
	}
}
