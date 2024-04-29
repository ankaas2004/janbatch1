package Testing;

public class Conditionwithloop3 {

	public void conditionwithloop5() {

		int num = 1, i;

		for (i = 1; i <= 4; i++)

		{

			for (int j = 1; j <= i; j++)
			{

				System.out.print(num + " ");
				num++;
			}
			System.out.println(" ");
		}

	}



	public static void main(String[] args) {
		Conditionwithloop3 obj = new Conditionwithloop3();
		obj.conditionwithloop5();
	}}

