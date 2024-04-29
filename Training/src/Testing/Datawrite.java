package Testing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Datawrite {
	
	public void Datewriter1() throws IOException {
		
	
	
	File f =new File("../Training/Files/Datewrite");
	//FileWriter fw = new FileWriter(f, true);
	FileWriter fw = new FileWriter(f);
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write ("new batch");
	bw.newLine();
	bw.write("new line");
	bw.close();
	
}
	
	public static void main(String[] args) throws IOException {
		Datawrite obj = new Datawrite();
		obj.Datewriter1();
	}
}


