package MTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main(String[] args) {
		
		

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.dream11.com/");
	
		
				driver.findElement(By.id("regEmail")).sendKeys("9039389303");
				driver.findElement(By.id("hamburger")).click();
					
				
	
		
	}

}
