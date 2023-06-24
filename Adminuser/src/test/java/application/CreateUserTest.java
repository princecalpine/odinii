package application;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import objectRepository.CreateUser;
import base.Base;


public class CreateUserTest extends Base {

	@Test
	public void CreateUser() throws IOException, InterruptedException {
		CreateUser Cu = new CreateUser(driver);

		Cu.UserManagement().click();
		Cu.AddNewUser().click();
		Cu.FirstName().sendKeys("TestPrince8");
		Cu.LastName().sendKeys("Last8");
		Cu.Email().sendKeys("testprince8@perkinelmer.com");
		WebElement RoleDropdown = Cu.Role();
		Select dropdownrole = new Select(RoleDropdown);
		dropdownrole.selectByVisibleText("Director");
		Cu.Clients().click();
		Cu.SpecificClients().click();
		Cu.Add().click();

	}

}
