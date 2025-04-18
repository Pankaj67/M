package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
   // 7/04/2025
public class GetfirstelectedOption {
	
	
	public static void main(String[] args) {

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();		
	driver.get("https://www.facebook.com/r.php?entry_point=login");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
WebElement car = 	driver.findElement(By.id("car"));
Select year = new Select(car);

List<WebElement>  alloption = year.getOptions();	
System.out.println(alloption.size());

for ( WebElement ele :alloption)
{
System.out.println(ele.getText());
}

	}
}
