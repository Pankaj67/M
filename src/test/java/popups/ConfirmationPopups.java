package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopups {
	public static void main(String[] args) {
		
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();		
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	
	
	 Alert popups = driver.switchTo().alert();
	 System.out.println(popups.getText());
	 popups.accept();

	 
	 
	 System.out.println(popups.getText());
	 popups.accept();
	
	 
	 
	 

	
	
	}

}
