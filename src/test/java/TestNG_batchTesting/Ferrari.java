package TestNG_batchTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Ferrari {
	
	@Test
public void  ferrari() {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();		
	driver.get("https://www.ferrari.com/en-EN");
	Reporter.log("lamborginin launch successfull", true);
	 }

}
