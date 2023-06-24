package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateUser {

	WebDriver driver;

	public CreateUser(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class='fas fa-user pe-2']")
	WebElement UserManagementTile;

	@FindBy(id = "btnadduser")
	WebElement Addnewuser;

	@FindBy(id = "firstName")
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
	WebElement AddUser;

	public WebElement UserManagement() {
		return UserManagementTile;
	}

	public WebElement AddNewUser() {
		return Addnewuser;
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

	public WebElement Add() {
		return AddUser;
	}

}
