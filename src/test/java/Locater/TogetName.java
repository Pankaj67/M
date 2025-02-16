package Locater;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TogetName {
	
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			Thread.sleep(5000);
					driver.findElement(By.name("username")).sendKeys("pankaj");
					Thread.sleep(5000);
			driver.quit();
		
		}

	}
