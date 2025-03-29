package Stale;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FLipkartPage {
	
	WebDriver driver;
		
		public FLipkartPage(WebDriver driver)
		{
			// intialise kiye hai 
			this.driver =driver;	
			
			
			// this method will create web elements
			PageFactory.initElements(driver, this);
			
		}
		
		// identify web elements 
		// identify user name
		 
		@FindBy(name="q")
		WebElement search;
		

		public WebElement getsearch() {
			return search;
		}
	
	
	}



