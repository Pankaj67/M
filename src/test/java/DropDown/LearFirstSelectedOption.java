package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearFirstSelectedOption {
	
	public static void main(String[] args) {
		
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();		
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_select_autofocus");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebElement car = 	driver.findElement(By.id("cars"));
Select carsel = new Select(car);
carsel.selectByIndex(2);
carsel.selectByIndex(0);


WebElement firstSelect = carsel.getFirstSelectedOption();
System.out.println(firstSelect.getText()); 


// to get all selected option 
 List<WebElement> allselectedOption = carsel.getAllSelectedOptions();
 System.out.println(allselectedOption.size());


for(WebElement a : allselectedOption)
{
System.out.println(a.getText());	
}

	

}
}
