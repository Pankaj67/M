package JavaScriptExcutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollTillBottom {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String timeStamp = 	LocalDateTime.now().toString().replace(":", "-");	
		
		WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();		
			driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");  // scroll till botttom 
			System.out.println("pkokocfk");
//			
//			TakesScreenshot ts = (TakesScreenshot) driver;
//			 File  temp=  	ts.getScreenshotAs(OutputType.FILE);
//			 File dest = new File("./Screenshot/"+timeStamp+".png");
//			 FileHandler.copy(temp, dest);
//		 		System.out.println("ok"); 

}
}
