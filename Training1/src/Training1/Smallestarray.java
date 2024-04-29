package Training1;

public class Smallestarray {
	
	public void smallestarray1() 
	
	{
	int arr[]	= {2,3,5,3,0,6,8};
	int small = arr[0];
	for(int i=0;i<=arr.length-1;i++)
	{
		if(arr[i]<small) {
			small = arr[i];	
		}
	
	}
	System.out.println(small);
	}
public static void main(String[] args) {
	Smallestarray obj = new Smallestarray();
	obj.smallestarray1();
}
}
