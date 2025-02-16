package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);	
 // WebElement radiobtn = driver.findElement(By.xpath("//input[@id='pollanswers-2']"));

  WebElement radiobtn = driver.findElement(By.xpath("//label[@text()='Good']/..//input[@type='radio']"));
Thread.sleep(2000);
  System.out.println(radiobtn.isSelected());
  Thread.sleep(2000);
  radiobtn.click();
  System.out.println(radiobtn.isSelected());
	


		
		
		

	}

}
