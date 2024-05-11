package dataproviders;

import org.testng.annotations.DataProvider;

public class Data {
	
	@DataProvider(name = "logindata")
	public Object[][] loginData() {
		Object[][]d=new Object[2][2];
		d[0][0]="msd@gmail.com";
		d[0][1]="Msd@123";
		d[1][0]="vijay@gail.com";
		d[1][1]="Vijay@123";
		return d;
	}

}
