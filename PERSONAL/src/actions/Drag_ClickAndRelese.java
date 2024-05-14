package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_ClickAndRelese {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(4000);
		//identify webelement src
		WebElement src = driver.findElement(By.id("box3"));
		//identify webelement target
		WebElement target = driver.findElement(By.id("box103"));
		Actions act=new Actions(driver);
		act.clickAndHold(src).perform();
		Thread.sleep(2000);
		act.release(target).perform();
	}

}
