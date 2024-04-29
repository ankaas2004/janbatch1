package Training1;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excelhandling4 {

	

public void excelhandleing4(int r, int c) throws BiffException, IOException {
		
		File f =new File("../Training1/Dataexcel.xls");
		Workbook wb= Workbook.getWorkbook(f);
		Sheet wk = wb.getSheet(0);
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
		Excelhandling4 obj = new Excelhandling4();
		obj.excelhandleing4(2,5);
	}


}
