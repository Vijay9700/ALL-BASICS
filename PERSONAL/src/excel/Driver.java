package excel;

import org.testng.annotations.Test;


public class Driver extends DataProviders_ {
	
	@Test(dataProvider = "login data")
	public void readData(String email,String pwd)
	{
		System.out.println(email);
		System.out.println(pwd);
	}

}
