package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelData {
	
	@DataProvider(name = "excelData")
	public Object[][] excelData() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./testscriptdata/logindata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("login");
		int cellno = sheet.getRow(0).getPhysicalNumberOfCells();
		int rowno = sheet.getPhysicalNumberOfRows();
		Object[][] data=new Object[rowno-1][cellno];
		for (int i = 1; i < rowno; i++) {
			for (int j = 0; j < cellno; j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}	
		}
		return data;
	}

}
