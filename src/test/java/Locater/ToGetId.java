package Locater;


	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;


public class ToGetId {		
	public static void main(String[] args) {
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("pankaj");
			//	driver.findElement(By.name("username")).sendKeys("pankaj");
				
				 driver.quit();
			
			}

		}



