package TestNG_ItestListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ItestListenerImplementtation.class)
public class TestScript extends BaseClass {
	
	
	
	@Test
	public void login()
	{
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys("mn093@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("pankaj@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
WebElement a = driver.findElement(By.xpath("//li[text()='No customer account found']"));
	Assert.assertEquals(a, "No customer account found");
Reporter.log("copied",true);
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop","title matched");
		
	
	}

}
