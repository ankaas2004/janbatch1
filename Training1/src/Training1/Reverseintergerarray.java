package Training1;

import java.util.Scanner;

public class Reverseintergerarray {
	public void reverseinterger1(int[] b)
	{
	//int a[]= {11,24,67};
	int len = b.length;
	for(int i=len-1;i>=0;i--)
	{
		System.out.println((b[i]) + " ");
	}
	//System.out.println(a[1]+" " +a[0]);
	
	}

	public static void main(String[] args) {
		Reverseintergerarray obj =new Reverseintergerarray();
		Scanner san = new Scanner(System.in);
		System.out.println("enter size of the array");  /// enter the size pf array
		int size =san.nextInt();
		int []myarray = new int[size];
		System.out.println("enter the elments of array");
		for(int i =0;i<=size-1;i++)  // loop to enter the array
			
		{
			myarray[i]=san.nextInt();
		}
		obj.reverseinterger1(myarray);
		san.close();
	}
}
