package Stale;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnStale {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/"); 
		
		FLipkartPage fp= new FLipkartPage(driver);
		fp.getsearch().sendKeys("mobiles",Keys.ENTER);
		
		
		Actions act = new Actions(driver);
		
act.keyDown(fp.getsearch(),Keys.CONTROL).keyDown("a").keyDown(Keys.BACK_SPACE).perform();
act.keyUp(Keys.CONTROL).keyUp("a").keyUp(Keys.BACK_SPACE).perform();
fp.getsearch().sendKeys("shoe"); 
	}
}

