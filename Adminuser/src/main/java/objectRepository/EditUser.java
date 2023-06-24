package objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditUser {

	WebDriver driver;

	public EditUser(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@class='fas fa-user pe-2']")
	WebElement UserManagementTile;

	@FindBy(xpath = "//input[@placeholder='Search Email Address']")
	WebElement EmailSearch;
	
	@FindBy(xpath = "//tr[@class='odd']//a[@class='dropdown dropdown-toggle p-0 textDropdown'][normalize-space()='...']")
	WebElement Actions;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu me-1 show']//a[@class='dropdown-item modelEditUser'][normalize-space()='Edit']")
	WebElement Edit;

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement FirstName;

	@FindBy(id = "lastName")
	WebElement LastName;

	@FindBy(id = "userName")
	WebElement Email;

	@FindBy(id = "role")
	WebElement Role;

	@FindBy(xpath = "//span[normalize-space()='Select Clients']")
	WebElement SelectClients;

	@FindBy(xpath = "//input[@id='ms-opt-18']")
	WebElement SpecificClient;

	@FindBy(id = "btnSave")
	WebElement SaveUser;
	
	public WebElement UserManagement() {
		return UserManagementTile;
	}


	public WebElement EmailSearch() {
		return EmailSearch;
	}

	public WebElement Actions() {
		return Actions;
	}
	
	public WebElement Edit() {
		return Edit;
	}

	public WebElement FirstName() {
		return FirstName;
	}

	public WebElement LastName() {
		return LastName;
	}

	public WebElement Email() {
		return Email;
	}

	public WebElement Role() {
		return Role;
	}

	public WebElement Clients() {
		return SelectClients;
	}

	public WebElement SpecificClients() {
		return SpecificClient;
	}

	public WebElement Save() {
		return SaveUser;
	}

}
