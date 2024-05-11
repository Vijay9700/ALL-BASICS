package dataproviders;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelData {
//	Workbook workbook = WorkbookFactory.create(fis);
//	Sheet sheet = workbook.getSheet("login");
//	
//	int row = sheet.getPhysicalNumberOfRows();
//	int column = sheet.getRow(0).getPhysicalNumberOfCells();
//	Object[][] data=new Object[row-1][column];
//	
//	for (int i = 1; i < row; i++) {
//		for (int j = 0; j < column; j++) {
//			data[i-1][j]=sheet.getRow(i).getCell(j).toString();
//		}
//	
	@DataProvider(name = "logindata")
	public Object[][] loginData() throws EncryptedDocumentException, IOException {
		String path="./testscriptdata/logindata.xlsx";
		FileInputStream fis=new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("login");
		int row = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[row-1][column];
		
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < column; j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
	}

}
