package disabled;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/disabled?sublist=3");
		//identify country dropdown
		WebElement countryDD = driver.findElement(By.id("SelectCountry"));
//		//JSE
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		Thread.sleep(1000);
//		js.executeScript("arguments[0].click();", countryDD);
//		WebElement usa = driver.findElement(By.id("United States"));
//		js.executeScript("arguments[0].click();", usa);
		Select sel=new Select(countryDD);
		List<WebElement> allOptions = sel.getOptions();
		for (WebElement opt : allOptions) {
			System.out.println(opt.getText());
		}
	}

}
