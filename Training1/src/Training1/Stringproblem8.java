package Training1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Stringproblem8 {
	
	
	   public void stringproblem8() throws IOException 
	   {
		   
			 
		   File f = new File ("../Training1/Datarea.txt"); //connection establish
	       FileReader fr =new FileReader(f); // read the file
	       BufferedReader b = new BufferedReader(fr); // read file line by line
	       String s;
	       String currentline = b.readLine();
	       System.out.println(currentline);
	       int count =0;
	       //while ((s=b.readLine())!=null)
	       while ( currentline !=null)
	       {
	    	   count= count +1;
	    	   //System.out.println(s);
	       }
	     System.out.println(count);

}
	   public static void main(String[] args) throws IOException {
		Stringproblem8	obj = new Stringproblem8();
		obj.stringproblem8();
	  }
}
