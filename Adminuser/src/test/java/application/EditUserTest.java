package application;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import objectRepository.EditUser;
import base.Base;

public class EditUserTest extends Base {

	@Test
	public void EditUser() throws IOException, InterruptedException {
		EditUser Eu = new EditUser(driver);
		
		Eu.UserManagement().click();
        Eu.EmailSearch().sendKeys("prince@perkinelmer.com");
		Eu.Actions().click();
		Eu.Edit().click();
		Thread.sleep(4500);
		Eu.FirstName().clear();
		Thread.sleep(4500);
		Eu.FirstName().sendKeys("Prince100");
		Thread.sleep(4500);
		WebElement RoleDropdown = Eu.Role();
		Select dropdownrole = new Select(RoleDropdown);
		dropdownrole.selectByVisibleText("admin");
		Thread.sleep(4500);
		Eu.Save().click();
		
	}

	}