package Training1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelHandling7 {

		
		public void excelwrting7(int r, int c) throws IOException, RowsExceededException, WriteException {
			
			File f1 = new File("..Training/Dataexcel1.xls");
			WritableWorkbook wb = Workbook.createWorkbook(f1);
			WritableSheet ws = wb.createSheet("Anjali",0);
			File f2 = new File("..Training/Dataexcel2.xls");
			WritableWorkbook wb1 = Workbook.createWorkbook(f2);
			WritableSheet ws2 = wb1.createSheet("Anjali1",0);
			for ( int i =0;i<r;i++)
			{
				for(int j=0;j<c; j++)
				{
					
				
					
					
							
				}
				
			}
				wb.write();
				wb.close();
			
		}
		//public static void main(String[] args) throws RowsExceededException, WriteException, IOException
		public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
			
			ExcelHandling7 obj = new ExcelHandling7();
			Scanner s = new Scanner(System.in);
			System.out.println("enter the row");
			int a=s.nextInt();
			System.out.println("enter the column");
			int b = s.nextInt();
			obj.excelwrting7(a,b);
		}
	
	


	}

