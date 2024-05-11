package autohealing;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pom_Model {
	
	public Pom_Model(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBys( {@FindBy(xpath = "//input[@type='radio']") })
	private List<WebElement> radioButton;

	public List<WebElement> getLoginButton() {
		return radioButton;
	}
	

}
