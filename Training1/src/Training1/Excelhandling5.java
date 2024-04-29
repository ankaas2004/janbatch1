package Training1;

	import java.io.File;
	import java.io.IOException;
	import jxl.Cell;
	import jxl.Sheet;
	import jxl.Workbook;
	import jxl.read.biff.BiffException;

	public class Excelhandling5 {	

	public void excelhandleing5(int r) throws BiffException, IOException {
			
			File f =new File("../Training1/Dataexcel1.xls");
			Workbook wb= Workbook.getWorkbook(f);
			Sheet wk = wb.getSheet(0);
			int c = wk.getColumns();
			for (int i= 0; i<r;i++)
				
			{
				int k=1;
				k=k+i;
				System.out.println("row" + k);
				
				for (int j=0;j<c;j++)
				{
					Cell wc=wk.getCell(j, i);
					System.out.println(wc.getContents());
					
				}
			}
			
		}
		public static void main(String[] args) throws BiffException, IOException {
			Excelhandling5 obj = new Excelhandling5();
			obj.excelhandleing5(2);
		}


	}
	
	


