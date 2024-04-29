package Testing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Datareadcharbychar {
	
  public void dateread() throws IOException {
	  
	  File f = new File ("../Training/Files/Datarea.txt"); // connection 
	  FileReader fr = new FileReader(f);   // read the file char by char
		int a;
		  while((a=fr.read()) !=-1) // loop for reading file data
				  {
			  System.out.print((char)a);
				  }
	
}

  public static void main(String[] args) throws IOException {
	Datareadcharbychar d= new Datareadcharbychar();
	d.dateread();
}
}
