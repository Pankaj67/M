package Mpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	
	public static void main(String[] args) {
		

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();		
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone");
	

WebElement a  =driver.findElement(By.xpath("//*[local-name()='svg']//*[@class='EwE-Fa']"));
a.click();
}
	

}