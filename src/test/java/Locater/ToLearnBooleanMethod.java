package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);

  WebElement a = driver.findElement(By.xpath("input[@class='form-control']"));
	//input[@class='form-control']
  Thread.sleep(2000);
		
  System.out.println(a.isDisplayed());
	

		
		
		
		
		
		//input[@class='form-control']
		// TODO Auto-generated method stub

	}

}
