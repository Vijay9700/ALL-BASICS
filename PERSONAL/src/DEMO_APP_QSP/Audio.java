package DEMO_APP_QSP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import jakarta.xml.bind.Element;

public class Audio {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/audio?sublist=0&scenario=1");
		//click on audio
		WebElement audio = driver.findElement(By.xpath("//audio[@src='/assets/audiofile-zzjK-tOl.mp3']"));
		//fetch size and position
		Dimension size = audio.getSize();
		Point location = audio.getLocation();
		System.out.println(location.getX());
		System.out.println(location.getY());
		Thread.sleep(2000);
//		Actions act=new Actions(driver);
//		//act.moveByOffset(555, 329).click().perform();
//		act.moveToLocation(600, 329).click().perform();
		audio.click();
	}

}
