package Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Base;
import listeners.ListenersImplementations;
@Listeners(listeners.ListenersImplementations.class)
public class Basic_Validation extends ListenersImplementations {
	
	@Test
	public void basicvaildation() {
		Base.driver=new ChromeDriver();
		Base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Base.driver.manage().window().maximize();
		Base.driver.get("https://demowebshop.tricentis.com/");
		//click on register
		Base.driver.findElement(By.linkText("Register")).click();
		//validate
		String title =Base.driver.getTitle();
		Assert.assertEquals(title.contains("register"), true);
		Reporter.log("pass",true);
		Base.driver.quit();
	}
}
