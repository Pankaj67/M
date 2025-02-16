package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetText {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");

		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	String a =driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful. Please correct the errors ')]")).getText();
		System.out.println(a);
	}

}
