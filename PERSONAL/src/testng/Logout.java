package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Logout {
	WebDriver driver;
	@Test()
	@Parameters("browser")
	public void logout(String browser)
	{
	if(browser.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if (browser.equalsIgnoreCase("edge")) 
	{
		driver=new EdgeDriver();
	}
	else if(browser.equalsIgnoreCase("ie"))
	{
		driver=new InternetExplorerDriver();
	}
	
	driver.get("https://www.facebook.com/");
		
	}

}
