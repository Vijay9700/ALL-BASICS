package autohealing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Script  {
	WebDriver driver;
	@Test
	public void test() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
//		FindBys_ b=new FindBys_(driver);
//		b.getFirstnameTextfield().sendKeys("VIJAY");
		FindAll_ a=new FindAll_(driver);
		a.getFirstname().sendKeys("MS DHONI");
	}

}
