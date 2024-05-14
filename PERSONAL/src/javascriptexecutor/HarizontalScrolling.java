package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HarizontalScrolling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabHorizontal");
		//JSE
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,0)");	
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(100,0)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(100,0)");
	}

}
