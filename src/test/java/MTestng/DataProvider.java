package MTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
	
	
	
	@Test(dataProvider="dataset")
	public void test( String username , String password)
	{
		System.out.println(username+"===="+password);
	
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.saucedemo.com/v1/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user-name")).sendKeys(username);
		
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		driver.close();
		
	}
	
	
	@org.testng.annotations.DataProvider(name="dataset")
	public Object [][] dataset()

	{
		return new Object [][]
				{
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
				};
				
}

}
