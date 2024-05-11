package childwindow;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandling {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/8");
		WebElement infoButton = driver.findElement(By.xpath("//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-2c7buj']"));
		infoButton.click();
		
		String pwid = driver.getWindowHandle();
		Set<String> allids = driver.getWindowHandles();
		for (String cwid : allids) {
			driver.switchTo().window(cwid);
			String allTitle = driver.getTitle();
			System.out.println(allTitle);
			
			if(allTitle.contains("eBay"))
			{
				driver.close();
				driver.manage().window().maximize();
			}
		}
		}

}
