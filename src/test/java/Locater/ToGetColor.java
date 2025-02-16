package Locater;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToGetColor {

	    public static void main(String[] args) {
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/login");
                driver.findElement(By.xpath("//input[@value='Log in']")).click();
		     	String a =driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("color");
				System.out.println(a);
			}

		
		// TODO Auto-generated method stub

	}


