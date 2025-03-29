package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethod {
	

	
	@Test( dependsOnMethods= "register")
	public void login() {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://demowebshop.tricentis.com/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.close();

		}

	 //invocation count repeat the function 4 times in sequence order 
		//Thread pool size run the funtion simultaneously 
		@Test( )
		public void  register() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://demowebshop.tricentis.com/register");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	
	
		}	
	
}

