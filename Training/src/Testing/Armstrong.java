package Testing;

public class Armstrong {
	
	public void Armstrong1(int number) 
	{
		
	int i,j, k,l;
	l=0;
	k= number;
	 while (k!=0) {
		 
		 i = number%10;
		 j= i*i*i;
		 System.out.println(j);
		 l = number / 100;
		 l = l*l*l;
		 System.out.println(l);
		 k =0;
		 
		 
		 
		 
	 }
		 
	}

	 public static void main(String[] args) 
	 {
		
		 Armstrong obj = new Armstrong();
		 obj.Armstrong1(153);
	}
}
