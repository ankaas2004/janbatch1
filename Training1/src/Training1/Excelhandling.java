package Training1;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excelhandling {
		
   public void excelwrting1(int r, int c) throws IOException, RowsExceededException, WriteException {
			
			File f = new File("../Training1/Dataexcel.xls");
			WritableWorkbook wb = Workbook.createWorkbook(f);
			WritableSheet ws = wb.createSheet("Anjali",0);
			for ( int i =0;i<r;i++)
			{
				for(int j=0;j<c; j++)
				{
					jxl.write.Label L = new jxl.write.Label(j, i, "Anjali");
					ws.addCell(L);
					
					
							
				}
				
			}
				wb.write();
				wb.close();
			
		}
		public static void main(String[] args) throws RowsExceededException, WriteException, IOException
		{
			
		
			Excelhandling obj = new Excelhandling();
			obj.excelwrting1(5,7);
		}
	
	
	}


