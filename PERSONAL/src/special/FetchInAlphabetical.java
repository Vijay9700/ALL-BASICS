package special;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jakarta.xml.bind.Element;

public class FetchInAlphabetical {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphones&as=on&as-show=on&otracker=AS_Query_HistoryAutoSuggest_1_2_na_na_na&otracker1=AS_Query_HistoryAutoSuggest_1_2_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=iphones&requestId=7ed27ff3-5a71-460b-b691-c90d80bf5d1e");
		//fetch all links
		List<WebElement> allProduct = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<String> productName=new ArrayList<String>();
		for (WebElement product : allProduct) {
			String text = product.getText();
			productName.add(text);
		}
		Collections.sort(productName);
		for (String name : productName) {
			System.out.println(name);
		}
		driver.quit();
	}

}
