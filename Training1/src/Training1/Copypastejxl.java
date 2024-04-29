package Training1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Copypastejxl {
	
	public void copypastejxl1() throws IOException, BiffException, RowsExceededException, WriteException
	{
		
		File sourcefile= new File("../Training1/Dataexcel.xls");
		File targetfile = new File ("../Training1/Dataexcel1.xls");
		Workbook sourceworkbook=Workbook.getWorkbook(sourcefile);
		Sheet sourcesheet=sourceworkbook.getSheet(0);
		WritableWorkbook targetworkbook = Workbook.createWorkbook(targetfile);
		WritableSheet targetsheet = targetworkbook.createSheet("Anjali",0);
		int r= sourcesheet.getRows();
		for(int i=0;i<r;i++)
		{
			int c=sourcesheet.getColumns();
			for (int j=0;j<c;j++)
			{
				Cell sourcecell=sourcesheet.getCell(j, i);
				String content =sourcecell.getContents();
				Label L = new Label(j,i,content);
				targetsheet.addCell(L);
			}
		}
		
		sourceworkbook.close();
		targetworkbook.write();
		targetworkbook.close();
	}

	

	public static void main(String[] args) throws IOException, BiffException, RowsExceededException, WriteException {
	Copypastejxl obj = new Copypastejxl();
	obj.copypastejxl1();
	}

}
