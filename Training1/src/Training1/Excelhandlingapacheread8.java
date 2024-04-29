package Training1;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelhandlingapacheread8 {

	public void excelhandling9(String path) throws IOException
	{
    File f = new File (path);
    FileInputStream fi = new FileInputStream(f);
    XSSFWorkbook xs = new XSSFWorkbook(fi);
    XSSFSheet xt = xs.getSheetAt(0);
    int r = xt.getPhysicalNumberOfRows();
    for ( int i =0; i<r; i++)
    {
    	XSSFRow xr = xt.getRow(i);
    	int c = xr.getPhysicalNumberOfCells();
    	for ( int j=0;j<c;j++)
    	{
    		XSSFCell xc = xr.getCell(j);
    		System.out.println(xc.getStringCellValue());
    	}
    }
    
    xs.close();
		
	}
   public static void main(String[] args) throws IOException {
	Excelhandlingapacheread8 obj = new Excelhandlingapacheread8();
	obj.excelhandling9("../Training1/Dataexcel2.xlsx");
			
}
}
