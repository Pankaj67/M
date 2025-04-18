package JavaScriptExcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsScrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();		
			driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
js.executeScript("window.scrollBy(0,2000)"); // c0-ordinatde calculated from scroll bar position 
//	js.executeScript("window.scrollTo(2000,500)"); // co-ordinate calculated from origin 
 // js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // scroll till bottom of the web page 
	
	// js.executeScript("history.go()"); //refresh the web page 
		
	}

}
