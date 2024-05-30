package dummy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step 1-->get the object of external file
		FileInputStream fis=new FileInputStream("./testscriptdata/logindata.xlsx");
		//step 2-->open excel in read mode
		Workbook workbook = WorkbookFactory.create(fis);
		//step 3-->get sheet control
		Sheet sheet = workbook.getSheet("login");
		//step 4-->get row control
		Row row = sheet.getRow(1);
		//step 5-->get cell control
		Cell cell = row.getCell(1);
		//step 6-->read data
		String data = cell.getStringCellValue();
		System.out.println(data);
	}

}
