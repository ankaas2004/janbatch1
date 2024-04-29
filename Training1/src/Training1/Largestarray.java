package Training1;

public class Largestarray 

{
	public void largestarray1() 
	{
		
	
	int arr[] = {6099,34,53,4532,421,5433};
	int Large = arr[0];
	for (int i=0;i<=arr.length-1;i++)
	{
	if(arr[i]>Large)
	{
		Large = arr[i];
	}
	}
	System.out.println(Large);
	}
public static void main(String[] args) {
	Largestarray obj = new Largestarray();
	obj.largestarray1();
	
}


}

