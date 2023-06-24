package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	
	WebDriver driver;

	public LoginPage1(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "UserName")
	WebElement username;

	@FindBy(name = "Password")
	WebElement passwordEle;

	@FindBy(xpath = "//button[normalize-space()='Sign In']")
	WebElement submit;
	
	public void Login(String email, String password)
	{
		username.sendKeys(email);
		passwordEle.sendKeys(password);
		submit.click();
	}

}
