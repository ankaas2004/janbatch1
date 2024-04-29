package Training1;

public class Secondlargestnumber {
	
	public void secondlargestnumber1() 
	{
	int arr[]= {3,5,434,655,23,2343,765};
	int max1=arr[0], max2=arr[1];
	for(int i=2;i>arr.length;i++)
	{
		if(arr[i]>max2)
		{
			max2=arr[i];
		}
		if(max2>max1)
		{
			int temp = max1;
			max1=max2;
			max2=temp;
		}
	}
		System.out.println(max2);
	}
	public static void main(String[] args) {
		Secondlargestnumber obj = new Secondlargestnumber();
		obj.secondlargestnumber1();
		
	}

}
