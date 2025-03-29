package MTestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class DataProviderPralleltestParam {
	
	  WebDriver driver ;
	  

		@BeforeClass
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException
	{

		driver = new ChromeDriver();
		
		switch(br.toLowerCase())
		{
		case "chrome": driver = new  ChromeDriver(); break;
		case "edge" : driver= new EdgeDriver(); break;
		case "firefox" : driver= new FirefoxDriver(); break;
		default : System.out.println("invalid browser");return;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
	}
	
//	@Test(priority=1)
//	void testlogo()
//	{
//	boolean status =	driver.findElement(By.xpath("//div[@class='orangehrm-login-logo-mobile']//img[@alt='orangehrm-logo']")).isDisplayed();
//	Assert.assertEquals(status, true);	
//	}
		
	@Test(priority=1)
	void testtitle()
	{
		AssertJUnit.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	
	@Test(priority=2)
	void testURL()
	{
		AssertJUnit.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
}
