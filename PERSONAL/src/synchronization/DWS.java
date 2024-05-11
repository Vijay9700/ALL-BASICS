package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demowebshop.tricentis.com/");
		//identify the jw
		//Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Jewelry")).click();
		//choose an item
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		//pass length
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class=\"textbox\"]")).sendKeys("10");
		//choose heart
		driver.findElement(By.id("product_attribute_71_11_17_49")).click();
		//click on add to cart
		driver.findElement(By.id("add-to-cart-button-71")).click();
		Thread.sleep(5000);
		//click on shopping cart
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		//validate
		//Thread.sleep(3000);
		String name = driver.findElement(By.xpath("(//a[text()='Create Your Own Jewelry'])[2]")).getText();
		//validate
		String expected="Create Your Own Jewelry";
		if(name.contains(expected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.quit();

}
}
