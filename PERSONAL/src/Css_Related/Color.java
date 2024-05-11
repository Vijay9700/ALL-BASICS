package Css_Related;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Color {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//email
		WebElement login = driver.findElement(By.name("login"));
		//background color
		String color = login.getCssValue("background-color");
		System.out.println(color);
		//text color
		String textColor = login.getCssValue("color");
		System.out.println(textColor);
		driver.quit();
	}

}
