package webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/table/dynamicTable");
		//identify element
		List<WebElement> allValues = driver.findElements(By.xpath("(//th[@class='px-6 py-4 font-medium text-gray-900 whitespace-nowrap'])[1]/../td"));
		for (WebElement value : allValues) {
			System.out.println(value.getText());
		}
		driver.quit();
	}

}
