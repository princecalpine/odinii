package adminuser;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Base;

public class Logintest extends Base {
	
	@Test
	  public static void basePageNavigation() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://google.com/");
		
	}
}
