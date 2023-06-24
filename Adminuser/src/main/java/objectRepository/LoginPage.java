package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "UserName")
	WebElement username;

	@FindBy(name = "Password")
	WebElement password;

	@FindBy(xpath = "//button[normalize-space()='Sign In']")
	WebElement submit;

	public WebElement EmailId() {
		return username;
	}

	public WebElement Password() {
		return password;
	}

	public WebElement Submit() {
		return submit;
	}

}