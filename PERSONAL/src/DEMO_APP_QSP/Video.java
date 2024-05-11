package DEMO_APP_QSP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/video?sublist=0&scenario=1");
		//click on video
		Thread.sleep(3000);
		driver.findElement(By.xpath("//video[@src='/assets/videofile-PWMPKjmv.mp4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//video[@src='/assets/videofile-PWMPKjmv.mp4']")).click();		
	}

}
