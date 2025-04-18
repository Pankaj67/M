package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnScroll {

	public static void main(String[] args) {
	
		
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();		
	driver.get("https://www.redbus.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
WebElement ok = 	driver.findElement(By.xpath("//a[@id='careers_footer']"));

Actions act = new Actions(driver);

 act.scrollToElement(ok).perform();

	}
}
