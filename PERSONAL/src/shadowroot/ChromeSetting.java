package shadowroot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSetting {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("chrome://settings/appearance");
		//identify show home toggle button and click
		//WebElement shadowRootEle=driver.findElement(By.cssSelector("cr-toggle[id='control']]"));
		 //-->we cant able to identify bz that is shadow root element
		WebElement shadowRootEle = driver.findElement(By.xpath("//settings-ui")).getShadowRoot()
			.findElement(By.cssSelector("settings-main#main")).getShadowRoot()
			.findElement(By.cssSelector("settings-basic-page[class='cr-centered-card-container']")).getShadowRoot()
			.findElement(By.cssSelector("settings-section[section='appearance']"))
			.findElement(By.tagName("settings-appearance-page")).getShadowRoot()
			.findElement(By.cssSelector("settings-toggle-button[label='Show home button']")).getShadowRoot()
			.findElement(By.cssSelector("cr-toggle[id='control']"));
		Thread.sleep(2000);
		System.out.println(shadowRootEle);
		shadowRootEle.click();
		Thread.sleep(1000);
		driver.quit();
	}

}
