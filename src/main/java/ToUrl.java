import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUrl {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		
	Thread.sleep(2000);
		//store the main url 
	//class url 
	URL mainURL = new URL("https://www.myntra.com/");
	
	URL women = new URL(mainURL,"shop/women");
	driver.navigate().to(women);
	
	Thread.sleep(2000);

   URL kids = new URL(mainURL,"shop/kids");
   driver.navigate().to(kids);
   String title  = driver.getTitle();
   String currenturl = driver.getCurrentUrl();
   System.out.println(currenturl);
   System.out.println(title);

     	
   driver.quit();
	
	
	}
 
}
