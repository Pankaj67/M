package TestNG_annotationconfiguration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC01 extends BaseClass {
	
	@Test
	public void clickbook()
	{
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop" , "login page is displayed");

		Reporter.log("ok", true );
	}
	
	

}
