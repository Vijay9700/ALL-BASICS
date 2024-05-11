package autohealing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindAll_ {
	
	public FindAll_(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//@FindAll-->will work like OR operator
	@FindAll({@FindBy(id = "firstn"),@FindBy(xpath = "//input[@aria-label='First name']")})
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}
	
}
