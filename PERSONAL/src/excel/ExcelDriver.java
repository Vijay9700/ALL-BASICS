package excel;

import org.testng.annotations.Test;

public class ExcelDriver extends ExcelData {
	
	@Test(dataProvider = "excelData")
	public void excelData(String email,String pwd)
	{
		System.out.println(email);
		System.out.println(pwd);
	}

}
