package TestNG_annotationconfiguration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public  static WebDriver driver ;  //global variable
	
	
	@BeforeClass
	public void openBrowser() {
   driver= new ChromeDriver(); // driver initlaize kiye hai 
	driver.manage().window().maximize();		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	
	}
	
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys("mn093@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("pankaj@123P");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
	}
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.xpath("//a[text()='Log out']")).click();;
	}
	
	
	
	@AfterClass
	 public void closeBrowser() throws InterruptedException
	 {
		Thread.sleep(2000);
		 driver.quit();
	 }
	
}
