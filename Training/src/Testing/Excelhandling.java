package Testing;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excelhandling {
	
	public void excelhandleing1() throws BiffException, IOException {
		
		File f =new File("../Training/Dataexcel.xls");
		Workbook wb= Workbook.getWorkbook(f);
		Sheet wk = wb.getSheet(0);
		int r = wk.getRows();
		int c = wk.getColumns();
		for (int i= 0; i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				Cell wc=wk.getCell(j, i);
				System.out.println(wc.getContents());
				
			}
		}
		
	}
	public static void main(String[] args) throws BiffException, IOException {
		Excelhandling obj = new Excelhandling();
		obj.excelhandleing1();
	}

}
