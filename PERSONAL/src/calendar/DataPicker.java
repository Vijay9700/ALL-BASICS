package calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPicker {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/");
		//identify the date textbox
		WebElement dateTextBox = driver.findElement(By.name("bdaytime"));
		//pass the date
		dateTextBox.sendKeys("22022024");
		//transfer the control to time
		dateTextBox.sendKeys(Keys.TAB);
		//pass date
		dateTextBox.sendKeys("21.10");
		//transfer the control to submit
		dateTextBox.sendKeys(Keys.TAB);
		//click on submit button
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
	}

}
