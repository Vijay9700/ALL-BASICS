package brokenlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink_ {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//fetch all links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for (int i = 0; i < allLinks.size(); i++) {
			String url=allLinks.get(i).getAttribute("href");
			if(!url.isEmpty())
			{
				URL l=new URL(url);
				//create connection
				HttpURLConnection httpconnection=(HttpURLConnection) l.openConnection();
				//establish connection
				httpconnection.connect();
				//get response code
				int rCode = httpconnection.getResponseCode();
				if(rCode>=400)
				{
					System.out.println(url+"--->"+rCode+"  is broken");
				}
				else
				{
					System.out.println(url+"-->"+rCode+"  is active link");
				}
			}
		}
		driver.quit();
	}

}
