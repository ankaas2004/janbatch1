package Testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Readdatabyrow {
	
	public void readdatabyrow(int rowno) throws IOException {
		
		String i;
		int count =0;
		File f=new File("../Training/Files/Datewrite");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		while ((i = br.readLine()) != null)
		
				{
			count=count+1;
			if (count ==rowno )
			{
				System.out.println(i);
				break;
			}
				}
				
		
	}
	public static void main(String[] args) throws IOException {
		Readdatabyrow obj = new Readdatabyrow();
		Scanner s = new Scanner(System.in);
		System.out.println("enter the row number ");
	    int j  = s.nextInt();
		obj.readdatabyrow(j);
	}

}
