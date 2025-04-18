package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



// 7/04/2025
public class MultiSelectList {
	
	
	
	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_select_autofocus");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	WebElement car = 	driver.findElement(By.id("car"));
   Select carsel = new Select(car);
   carsel.selectByVisibleText("volvo");
   carsel.selectByIndex(0);
   carsel.selectByValue("f");
   
   
   
   


}

}
