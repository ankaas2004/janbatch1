package Testing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writedatabyrange {
	
	static Scanner s = new Scanner(System.in);
		public void writedatabyrange(int initialrowno, int endrowno) throws IOException 
		{
			
			String i=null;
			int count;
			File f=new File("../Training/Files/Datewrite");
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			//bw.append((char) 3);
			for (count = 0; count <= endrowno;count++)
			{
				if ((count >=initialrowno)&&(count <= endrowno))
				{
					System.out.println("enter the data");
					i=s.next();
					bw.write(i);
					bw.newLine();
				
				}
				else
				{
				bw.newLine();	
				}
			
					}
			bw.close();
					
			
		}
		public static void main(String[] args) throws IOException {
			Writedatabyrange obj = new Writedatabyrange();
			System.out.println("enter the initial  number ");
		    int j  = s.nextInt();
		    System.out.println("enter the end number ");
		    int k = s.nextInt();
			obj.writedatabyrange(j,k);

}
}
