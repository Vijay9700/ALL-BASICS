package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DWS_Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		WebElement selectByAlbha = driver.findElement(By.id("products-orderby"));
		Select sel=new Select(selectByAlbha); 
		List<WebElement> opt = sel.getOptions();
		for(int i=0;i<opt.size();i++)
		{
			selectByAlbha = driver.findElement(By.id("products-orderby"));
			sel=new Select(selectByAlbha); 
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
	}

}
