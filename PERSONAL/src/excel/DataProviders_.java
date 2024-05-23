package excel;

import org.testng.annotations.DataProvider;

public class DataProviders_ {
	
	@DataProvider(name = "login data")
	public Object[][] loginData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="vijay@gmail.com";
		data[0][1]="Vijay@123";
		data[1][0]="msd@gmail.com";
		data[1][1]="Msd@123";
		return data;
	}

}
