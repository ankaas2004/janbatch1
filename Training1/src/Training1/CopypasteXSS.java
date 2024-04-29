package Training1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CopypasteXSS {

	public void copypasteXSS1() throws IOException, InvalidFormatException {
	
		File f1= new File("../Training1/Dataexcel2.xlsx");
		File f2 = new File ("../Training1/Dataexcel3.xlsx");
		FileInputStream fr = new FileInputStream(f1);
		FileOutputStream fo = new FileOutputStream(f2);
		XSSFWorkbook xw = new XSSFWorkbook(fr);
		XSSFSheet xs = xw.getSheet("Anjali");
		XSSFWorkbook xw1= new XSSFWorkbook();
		XSSFSheet xs1 = xw1.createSheet("Sheet1");
		int r = xs.getPhysicalNumberOfRows();
		for (int i=0;i<r;i++)
		{
			XSSFRow xr =xs.getRow(i);
			XSSFRow xr1 = xs1.createRow(i);
			int c= xr.getPhysicalNumberOfCells();
			for ( int j=0;j<c;j++)
			{
				XSSFCell xc =xr.getCell(j);
				XSSFCell xc1=xr1.createCell(j);
				xc1.setCellValue(xc.getStringCellValue());
			}
		}
		xw.write(fo);
		fo.flush();
		fo.close();
	}
	public static void main(String[] args) throws InvalidFormatException, IOException {
		CopypasteXSS obj = new CopypasteXSS();
		obj.copypasteXSS1();
	}
	
}
