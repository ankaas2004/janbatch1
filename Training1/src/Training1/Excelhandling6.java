package Training1;



	import java.io.File;
	import java.io.IOException;
	import jxl.Cell;
	import jxl.Sheet;
	import jxl.Workbook;
	import jxl.read.biff.BiffException;

	public class Excelhandling6 {	

	public void excelhandleing6(int r1, int r2) throws BiffException, IOException {
			
			File f =new File("../Training1/Dataexcel1.xls");
			Workbook wb= Workbook.getWorkbook(f);
			Sheet wk = wb.getSheet(0);
			int c = wk.getColumns();
			int r3=r1-1;
			for (int i= r3; i<r2;i++)
				
			{
				System.out.println("row" + r1);
				r1++;
				

				
				for (int j=0;j<c;j++)
				{
					Cell wc=wk.getCell(j, i);
					System.out.println(wc.getContents());
					
				}
			}
			
		}
		public static void main(String[] args) throws BiffException, IOException {
			Excelhandling6 obj = new Excelhandling6();
			obj.excelhandleing6(2,4);
		}

	}

