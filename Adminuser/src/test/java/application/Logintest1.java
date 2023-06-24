package application;
import java.io.IOException;

import org.testng.annotations.Test;

import base.Base;
import objectRepository.LoginPage1;

public class Logintest1 extends Base {

	@Test
	public static void basePageNavigation() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get("http://internal-egeria-dev-internal-789047063.us-east-1.elb.amazonaws.com/");
		LoginPage1 l = new LoginPage1(driver);
		l.Login("prince.cl.ext@perkinelmer.com", "prince");
		
	}
}
