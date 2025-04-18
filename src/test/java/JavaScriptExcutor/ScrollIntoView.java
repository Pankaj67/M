package JavaScriptExcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {
	public static void main(String[] args) {
		
	

	WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	WebElement element = driver.findElement(By.xpath("//a[contains(text(),'$25 Virtual Gift Card')]"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView(false)",element);  // scroll till botttom 
		System.out.println("pkokocfk");
// 
		
		//scroll into view(boolean)
	//	it is used to scroll the element into visible area 
	// note : argument[0] is a predefiend variable of javascript, which will recieve input from 2nd argument 
	}
	
	
	
}
