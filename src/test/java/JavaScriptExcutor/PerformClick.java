package JavaScriptExcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformClick {
	public static void main(String[] args) {
		

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();		
	driver.get("https://demowebshop.tricentis.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//WebElement element = driver.findElement(By.linkText("//a[contains(text(),'$25 Virtual Gift Card')]"));
WebElement clickwithoutclickmethod = driver.findElement(By.linkText("Register"));

JavascriptExecutor js = (JavascriptExecutor) driver;
 js.executeScript("arguments[0].click()",clickwithoutclickmethod);
	
	}	

}
