package MfailedTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failedtest {
	
	
	
	@Test(retryAnalyzer = RetryAnalyser.class) 
public void  AUDI() {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();		
	driver.get("https://www.audi.in/en/");
	Reporter.log("audi launch successfull", true);
	
	 }
	@Test(retryAnalyzer = RetryAnalyser.class)
public void  AUD() {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();		
	driver.get("http//www.audi.in/en/");
	Reporter.log("audi launch successfull", true);
	 }





}
