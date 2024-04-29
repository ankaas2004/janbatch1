package Testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Datareadlinebyline {
	
   public void datarardlinebyline() throws IOException {
	   
	 
	   File f = new File ("../Training/Files/Datarea.txt"); //connection establish
       FileReader fr =new FileReader(f); // read the file
       BufferedReader b = new BufferedReader(fr); // read file line by line
       String s;
       while ((s=b.readLine())!=null)
       {
    	   System.out.println(s);
       }
     
}
 public static void main(String[] args) throws IOException {
	Datareadlinebyline d = new Datareadlinebyline();
	d.datarardlinebyline();
}
}
