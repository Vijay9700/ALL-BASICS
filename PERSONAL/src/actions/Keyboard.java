package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		//WebElement email = driver.findElement(By.id("email"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.PAGE_DOWN).perform();
	}

}
