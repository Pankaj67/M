package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//11/04/2025

public class AlertPopups {
	public static void main(String[] args) {
	
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();		
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	 Alert popups = driver.switchTo().alert();
	 System.out.println(popups.getText());
	// popups.accept();
	 popups.dismiss();
	 
	 
	}

}
