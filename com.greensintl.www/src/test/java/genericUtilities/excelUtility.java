package genericUtilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelUtility implements IPathConstant{

	
	public String getSingleDataFromExcel(String sheetName,int rowNum, int cellNum) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IPathConstant.excelFilePath);
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet("Sheet1").getRow(rowNum).getCell(cellNum).getStringCellValue();
		System.out.println(data);
		return data;
				
	}
}
	