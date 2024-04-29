package Training1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelhandlingapacheread3 {

	public void excelhandlingapacheread3(String path, int r1, int r2, int c1, int c2) throws IOException {
		
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook xb = new XSSFWorkbook(fi);
		XSSFSheet xs = xb.getSheetAt(0);
		for (int i = r1;i<=r2; i++)
		{
			XSSFRow xr = xs.getRow(i);
			
			for (int j = c1;j<=c2;j++)
			{
				XSSFCell xc = xr.getCell(j);
				System.out.println(xc.getStringCellValue());
			}
			
		}
		
		
		
		
	}
	public static void main(String[] args) throws IOException 
	{
		Excelhandlingapacheread3 obj = new Excelhandlingapacheread3();
		Scanner s = new Scanner(System.in);
		System.out.println( "enter the start row:");
		int c=s.nextInt()	;
		System.out.println( "enter the end row:");
		int d=s.nextInt()	;
		System.out.println( "enter the start column:");
		int e=s.nextInt()	;
		System.out.println( "enter the end column:");
		int f=s.nextInt()	;
		obj.excelhandlingapacheread3("../Training1/Dataexcel2.xlsx",c,d,e,f);	
		
	}
}
