package Testing;

public class doubleloop {
	
	public void conditionwithloop2() {
		
		int i;
		for(i=0;i<=5;i++)
	
		{
			for (int j=4;j>=i;--j)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
			
	}
	public static void main(String[] args) {
		
		doubleloop obj = new doubleloop();
		obj.conditionwithloop2();
	}

}
