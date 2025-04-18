package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToGetLearnOption {
	
	
public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	WebElement yeardropdown= 	driver.findElement(By.id("year"));
	Select year = new Select(yeardropdown);
	
List<WebElement>  alloption = year.getOptions();	
System.out.println(alloption.size());
	
 // sorte

int count = alloption.size()-2;

//this is for capture last options
int index=0;
for(WebElement option:alloption) {
	if(index==alloption.size()-2) {
		System.out.println(option.getText());
	}
	index++;
	
}

for ( WebElement ele :alloption)
	{
	
	System.out.println(ele.getText());
	}

}


}