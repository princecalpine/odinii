package application;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Base;
import objectRepository.LoginPage;

public class Logintest extends Base {

	@Test
	public static void basePageNavigation() throws IOException, InterruptedException {
		driver = initializeDriver();
		//testingtestingtestinggggggggggglibitha;
		driver.get("http://internal-egeria-dev-internal-789047063.us-east-1.elb.amazonaws.com/");
		LoginPage l = new LoginPage(driver);
		l.EmailId().sendKeys("prince.cl.ext@perkinelmer.com");
		l.Password().sendKeys("prince");
		l.Submit().click();

	}
}
