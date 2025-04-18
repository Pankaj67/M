 package TestNG_DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

 //  public class DataProviderr  extends DataStorage{
public class DataProviderr  {
	
	@Test(dataProviderClass= DataStorage.class ,dataProvider="dataSender")
//	@Test(dataProvider="dataSender")
	public void Login(String[] cred) {
		WebDriver driver= new ChromeDriver(); // driver initlaize kiye hai 
			driver.manage().window().maximize();		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.saucedemo.com/v1/");
			driver.findElement(By.id("user-name")).sendKeys(cred[0]);
			 driver.findElement(By.id("password")).sendKeys(cred[1]);
			 driver.findElement(By.id("login-button")).click();
			 
			  
				 
	}
	
	
	
	
}
