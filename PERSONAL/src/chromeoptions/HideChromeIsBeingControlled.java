package chromeoptions;

import java.util.Arrays;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HideChromeIsBeingControlled {
	
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-infobars","--start-maximized","--version");
		//opt.setExperimentalOption("exclueSwitches", Arrays.asList("enable-automation"));
		WebDriver driver=new ChromeDriver(opt);
	}

}
