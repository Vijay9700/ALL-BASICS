package autohealing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FindBys_ {
	public FindBys_(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//@FindBys--->work like and operator
	@FindBys({@FindBy(name = "firstname"),@FindBy(xpath = "//input[@aria-label='First name']")})
	private WebElement firstnameTextfield;

	public WebElement getFirstnameTextfield() {
		return firstnameTextfield;
	}

}
