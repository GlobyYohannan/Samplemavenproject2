package DataDriven1;
import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream file=new FileInputStream(Constpaths.Test_Path);
HSSFWorkbook workbook=new HSSFWorkbook(file);
HSSFSheet sheet=workbook.getSheetAt(0);
HSSFRow row=sheet.getRow(0);
HSSFCell cell=row.getCell(0);
System.out.println(cell);

for(Row r: sheet)
{
	for (Cell c: r)
		
	{
		System.out.print(c+ " ");
		
	}
	System.out.println();
}
	}

}
