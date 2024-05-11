package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/slider?sublist=0");
		Thread.sleep(2000);
		WebElement left = driver.findElement(By.xpath("//input[@type='range']"));
		//WebElement right = driver.findElement(By.xpath("(//div[@class='_3FdLqY'])[2]"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDropBy(left, 400, 0).perform();
		Thread.sleep(1000);
		act.dragAndDropBy(left, -300, 0).perform();
	}

}
