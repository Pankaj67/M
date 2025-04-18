package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopups {
	
	public static void main(String[] args) {
		
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();		
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	
	
	driver.switchTo().frame("iframeResult");
	
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	
	Alert prompt = driver.switchTo().alert();
	prompt.sendKeys("panakj");
	prompt.accept();
	
	
	driver.switchTo().frame("iframeResult");
	WebElement text = driver.findElement(By.xpath("//p[@id='demo']"));
	System.out.println(text);

	
	}
	
	

}
