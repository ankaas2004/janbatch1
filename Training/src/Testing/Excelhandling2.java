package Testing;

import java.awt.Label;
import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excelhandling2 {
		
		public void excelwrting1() throws IOException, RowsExceededException, WriteException {
			
			File f = new File("..Training/Dataexcel1.xls");
			WritableWorkbook wb = Workbook.createWorkbook(f);
			WritableSheet ws = wb.createSheet("Anjali",0);
			for ( int i =0;i<2;i++)
			{
				for(int j=0;j<3; j++)
				{
				Label L = new Label(j, i, "Anjali");
					ws.addCell(L);
					
					
							
				}
				
			}
				wb.write();
				wb.close();
			
		}
		// TODO Auto-generated constructor stub
	

	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		// TODO Auto-generated method stub
   Excelhandling2 obj=new Excelhandling2();
   obj.excelwrting1();
	}

}
