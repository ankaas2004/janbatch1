package Testing;

public class Table {

	public void table1(int n) {
		int i,j;
		
		for(i=1; i<=10; i++)
		{
			j= n*i;
			System.out.println(n +"*" + i + "= " + j);
			
		}
	}
	public static void main(String[] args) {
		Table obj = new Table();
		
	obj.table1(8); 
	}
}
