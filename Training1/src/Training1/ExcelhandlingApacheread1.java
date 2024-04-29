package Training1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelhandlingApacheread1
{

	public void excelhandlingApacheread1(String path,int a, int b) throws InvalidFormatException, IOException 
	{
	
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook xb = new XSSFWorkbook(fi);
		XSSFSheet xs = xb.getSheetAt(0);
		//int r = xs.getPhysicalNumberOfRows();
		for (int i=a-1;i<a;i++)
		{
			XSSFRow xr = xs.getRow(i);
			
			
			//int c = xr.getPhysicalNumberOfCells();
			
			for (int j=b-1;j<b;j++)
			{
				XSSFCell xc = xr.getCell(j);
				System.out.println(xc.getStringCellValue());
			}
		}
				
    xb.close();
		
	}
 public static void main(String[] args) throws InvalidFormatException, IOException
  	{
	ExcelhandlingApacheread1 obj = new ExcelhandlingApacheread1();
	Scanner s = new Scanner(System.in);
	System.out.println( "enter the row:");
	int c=s.nextInt()	;
	System.out.println("Enter the column");
	int j =s.nextInt();
	obj.excelhandlingApacheread1("../Training1/Dataexcel2.xlsx",c,j);
	 
}
}
