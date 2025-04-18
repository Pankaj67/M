package TestNG_Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class HardAssertion {
	
	@Test
	public void Login() {
	WebDriver driver= new ChromeDriver(); // driver initlaize kiye hai 
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Login" , "login page is not displayed");
	 Reporter.log("login opage displayed ", true);
	 driver.findElement(By.id("Email")).sendKeys("mn093@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("pankaj@123P");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click(); 
	 
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop" , "login page is not displayed");

	
	}
}

	
	
