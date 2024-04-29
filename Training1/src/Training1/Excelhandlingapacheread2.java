package Training1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelhandlingapacheread2 
{

	public void excelhandlingapacheread2(String path, int a) throws IOException
	
	{
	File f = new File(path);
	FileInputStream fi = new FileInputStream(f);
	XSSFWorkbook xb = new XSSFWorkbook(fi);
	XSSFSheet xs= xb.getSheetAt(0);
	int i=0;
	i=a;
	while (i==a)
	{
		XSSFRow xr = xs.getRow(i);
		
		int c = xr.getPhysicalNumberOfCells();
		for (int j=0;j<c;j++)
		{
			XSSFCell xc = xr.getCell(j);
			System.out.println(xc.getStringCellValue());
			
		}
		
		break;
	}
	}
	
	public static void main(String[] args) throws IOException {
		Excelhandlingapacheread2 obj = new Excelhandlingapacheread2();
		Scanner s = new Scanner(System.in);
		System.out.println( "enter the row:");
		int c=s.nextInt()	;
		obj.excelhandlingapacheread2("../Training1/Dataexcel2.xlsx",c);
	}
}


