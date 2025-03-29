package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TolearnMOUSEhover {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.flipkart.com/");
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@123");

	WebElement eyeicon=	driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));	
	Actions act = new Actions(driver);
	act.clickAndHold(eyeicon).pause(2000).release().perform();
	

		// TODO Auto-generated method stub

	}

}
