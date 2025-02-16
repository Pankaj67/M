package Locater;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToLearnGetLocation {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/login");

		Point size= driver.findElement(By.xpath("//input[@value='Search']")).getLocation();
		//input[@class='form-control']
			
			System.out.println(size.getX());
			System.out.println(size.getY());
			

	}
}
