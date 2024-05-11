package chromeoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBraveBrowser {
	
	public static void main(String[] args) {
		//create object for chromeoptions
		ChromeOptions option=new ChromeOptions();
		//pass the brave path
		option.setBinary
	("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

}
