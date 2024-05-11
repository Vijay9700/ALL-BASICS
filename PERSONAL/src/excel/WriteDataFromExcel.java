package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataFromExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "./testscriptdata/logindata.xlsx";
		FileInputStream fis=new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("login");
		Row row = sheet.getRow(0);
		//create cell
		Cell cell = row.createCell(2);
		//set the value
		cell.setCellValue("RESULT");
		//write the value in excel
		FileOutputStream fos=new FileOutputStream(path);
		workbook.write(fos);
		//close the workbook
		workbook.close();
	}

}
