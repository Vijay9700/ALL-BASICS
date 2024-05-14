package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		//identify webelement
		WebElement circle = driver.findElement(By.xpath("//div[@id='circle']"));
		//actions
		Actions act=new Actions(driver);
		act.clickAndHold(circle).perform();
		Thread.sleep(3000);
		act.release().perform();
	}

}
