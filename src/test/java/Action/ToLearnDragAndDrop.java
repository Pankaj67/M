package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDragAndDrop {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		
	WebElement photoframe= 	driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	
	driver.switchTo().frame(photoframe);
	WebElement drag1= 	driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	WebElement drag= 	driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	WebElement drop= 	driver.findElement(By.xpath("//div[@id='trash']"));

	Actions act = new Actions(driver);
	act.dragAndDrop(drag1, drop).perform();
	
driver.switchTo().defaultContent();

			
	}
	
}
