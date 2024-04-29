package Testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Readdatabyrange {
	
	public void readdatabyrange(int initialrowno, int endrowno) throws IOException 
	{
		
		String i;
		int count =0;
		File f=new File("../Training/Files/Datewrite");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		while ((i = br.readLine()) != null)
		
				{
			count=count+1;
			if ((count >=initialrowno)&&(count <= endrowno))
			{
				System.out.println(i);
				
			}
				}
				
		
	}
	public static void main(String[] args) throws IOException {
		Readdatabyrange obj = new Readdatabyrange();
		Scanner s = new Scanner(System.in);
		System.out.println("enter the initial  number ");
	    int j  = s.nextInt();
	    System.out.println("enter the end number ");
	    int k = s.nextInt();
		obj.readdatabyrange(j,k);

	}
}