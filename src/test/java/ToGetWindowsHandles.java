
	
	import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class ToGetWindowsHandles {
		public static void main(String[] args) {
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.irctc.co.in/nget/train-search");
			driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
	Set<String> handles = driver.getWindowHandles(); 
	
	// parentid-> childis->subchildid
	Iterator  it = handles.iterator();
	
	String  Parentid= (String) it.next();
	String  childid= (String) it.next();
			driver.switchTo().window(childid);
		
			driver.findElement(By.xpath("//i[@class='IRBus']")).click();	
			driver.switchTo().window(Parentid);
		
			
driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("Durg");
			
			
		}

	}


