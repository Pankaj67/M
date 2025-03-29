package TestNG_batchTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bmw {
	
	
	@Test
public void  BMW() {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();		
	driver.get("https://www.bmw.in/en/index.html");
	Reporter.log("bmw launch successfull", true);
	 }


}
