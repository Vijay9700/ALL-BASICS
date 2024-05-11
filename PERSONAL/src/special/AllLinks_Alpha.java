package special;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks_Alpha {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//fetch all links
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		List<String> allName=new ArrayList<String>();
		for (WebElement link : allLinks) {
			String text = link.getText();
			if(!text.isEmpty())
			{
				allName.add(text);	
			}
		}
		Collections.sort(allName);
		for (String s : allName) {
			System.out.println(s);
		}
		driver.quit();
	}

}
