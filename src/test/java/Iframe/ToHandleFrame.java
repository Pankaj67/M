package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFrame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();		
			driver.get("https://www.dream11.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// by frame 
	//	driver.switchTo().frame(0);
		
		
		
		// by id
		//driver.switchTo().frame("send-sms-iframe");
		
		//driver.findElement(By.id("regEmail")).sendKeys("9039389303");


	WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
driver.switchTo().frame(iframe);
driver.findElement(By.id("regEmail")).sendKeys("9039389303");


//return to parent windows 
	//driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	
driver.findElement(By.id("hamburger")).click();



}
}

