 package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToGetElementScreenShot {
	public static void main(String[] args) throws IOException {
		
	String timeStamp = 	LocalDateTime.now().toString().replace(":", "-");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://demowebshop.tricentis.com/");

		File temp = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).getScreenshotAs(OutputType.FILE);
		
	 File dest = new File("./Screenshot/Webelement.png");
	 FileHandler.copy(temp, dest);
 		

	}	
		
		
}
