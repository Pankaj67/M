package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// 10 /04/2025

public class TolearnMOUSEhover {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.flipkart.com/");
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	WebElement ok = 	driver.findElement(By.xpath("//span[text()='Home & Furniture']"));

//	WebElement eyeicon=	driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));	
	Actions act = new Actions(driver);
	//act.clickAndHold(ok).pause(2000).release().perform();
	  act.clickAndHold(ok).perform();
	
	  // in industry we dont recomded
	  
	  //act.moveByOffset(832, 176).perform();
	
	
	



	}

}
