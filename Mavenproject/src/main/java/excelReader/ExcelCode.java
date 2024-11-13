package excelReader;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelCode
{
	static FileInputStream f;           //inbuild class to read the file 
	static XSSFWorkbook w;              //inbuild class to read the workbook 
	static XSSFSheet sh;                //inbuild class to read the sheet 
	
	
	
	
	public static String readStringData(int row, int col) throws IOException          //method to read string data
	{
		f= new FileInputStream ("C:\\Users\\User\\Desktop\\Details.xlsx");   //file path
		w= new XSSFWorkbook(f);  //w is workbook
		sh= w.getSheet("Sheet 1");  //sh is sheet
		XSSFRow r= sh.getRow(row);
		XSSFCell c= r.getCell(col);
		return c.getStringCellValue();
	}
	
	public static String readIntegerData(int row, int col) throws IOException
	{
		f= new FileInputStream ("C:\\Users\\User\\Desktop\\Details.xlsx");
		w= new XSSFWorkbook(f);
		sh= w.getSheet("Sheet 1");
		XSSFRow r= sh.getRow(row);
		XSSFCell c= r.getCell(col);
		int val = (int) c.getNumericCellValue();
		return String.valueOf(val);
	}
}	

	


