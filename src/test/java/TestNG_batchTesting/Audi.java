package TestNG_batchTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Audi {
	
	
	
	@Test
public void  AUDI() {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();		
	driver.get("https://www.audi.in/en/");
	Reporter.log("audi launch successfull", true);
	 }


}
