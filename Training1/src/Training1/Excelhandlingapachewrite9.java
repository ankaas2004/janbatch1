package Training1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelhandlingapachewrite9 {

	
	public void excelhandling10(String path) throws IOException 
	{
		File f = new File(path);
		FileOutputStream fo = new FileOutputStream(f);
		XSSFWorkbook xw = new XSSFWorkbook();
		XSSFSheet xs = xw.createSheet("Anjali");
		for (int i=0;i<3;i++)
		{
			XSSFRow xr = xs.createRow(i);
			for (int j =0; j<3; j++)
			{
				XSSFCell xc = xr.createCell(j);
				xc.setCellValue("abc");
				
				
			}
			
		}
		xw.write(fo);
		fo.flush();
		fo.close();
	}
	   public static void main(String[] args) throws IOException {
			Excelhandlingapachewrite9 obj = new Excelhandlingapachewrite9();
			obj.excelhandling10("../Training1/Dataexcel3.xlsx");
					
		}
}
