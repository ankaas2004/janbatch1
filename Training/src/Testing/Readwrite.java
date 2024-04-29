package Testing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
	
public class Readwrite {
	
	public void readwrite() throws IOException{
		
			
			String i=null;
			//int count;
			File f1=new File("../Training/Files/Datewrite");
			File f2=new File("../Training/Files/Datewrite1");
			FileReader fr = new FileReader(f1);
			FileWriter fw = new FileWriter(f2);
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			CharSequence a = "testing10";
			while ((i =br.readLine()) != null)
		
			{
			bw.write(i);
			bw.newLine();
			}
			bw.append(a);
			br.close();
			bw.close();
					
			
		}
		public static void main(String[] args) throws IOException {
			
			Readwrite obj = new Readwrite();
			obj.readwrite();
		}
	}


