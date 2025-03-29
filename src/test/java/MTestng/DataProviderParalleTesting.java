 package MTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProviderParalleTesting {
	
	
	WebDriver driver;
	
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	@Test(dataProvider="dp")
	void testlogin(String email, String pwd) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
	
		boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();	
		Thread.sleep(2000);
		System.out.println("ok");
		if (status==true)	
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")).click();
	Assert.assertTrue(true);
	Thread.sleep(2000);

	}
	else
	{
		
		Assert.fail();
	}	
	}
	
	



	@AfterClass
	void tearDown()
	{
		
		driver.quit();
}
	
	// here indices which one want to take asa a login input 
	@org.testng.annotations.DataProvider(name="dp" , indices = {1,4})
	Object[][] loginData(){
		
		 Object data[][] =
			 {
					 {"a@gmail.com","test1234"},
					 {"b@gmail.com","test1235"},
					 {"c@gmail.com","test123a"},
					 {"d@gmail.com","test123@"},
					 {"mok@gmail.com","pankaj@123"},
					 
			 };
		 return data;
	 
	}
	
	
	
	
	

}
