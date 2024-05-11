package dataproviders;

import org.testng.annotations.Test;

public class ExcelExecutable extends ExcelData {
	@Test(dataProvider = "logindata")
	public void loginTest(String email,String pwd)
	{
		System.out.println(email);
		System.out.println(pwd);
	}
}
