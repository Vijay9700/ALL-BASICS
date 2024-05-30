package special;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		//search for india
		driver.findElement(By.name("q")).sendKeys("india");
		Thread.sleep(2000);
		//fetch all recommandations
		List<WebElement> allRec = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/li/div/div[2]/div/div/span/b"));
		Thread.sleep(3000);
		for (WebElement rec : allRec) {
			String recommandation = rec.getText();
			if (recommandation.contains("england")) {
				rec.click();
				break;
			}
		}
	}

}
