package practi;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import genericUtilities.IPathConstant;

public class pract implements IPathConstant{
@Test 
public void m3() throws Throwable
{
	System.out.println("seb");
	FileInputStream fis=new FileInputStream(IPathConstant.propertyFilePath);
	Properties prop=new Properties();
	prop.load(fis);
	String URL=prop.getProperty("url");
	System.out.println(URL);
}
@Test
public void m2() throws Throwable
{
	System.out.println("seb2");
	FileInputStream fis2=new FileInputStream(IPathConstant.excelFilePath);
	Workbook wb=WorkbookFactory.create(fis2);
	String data=wb.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
	System.out.println(data);
}
}
