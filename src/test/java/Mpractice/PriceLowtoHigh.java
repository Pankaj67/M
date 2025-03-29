package Mpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceLowtoHigh {
	
	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement search =driver.findElement(By.id("twotabsearchtextbox"));	
    search.sendKeys("mobile Phone");

	driver.findElement(By.id("nav-search-submit-button")).click();
	
	
	List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	
	for(int i =0;i<list.size();i++) {
System.out.println(list.get(i).getText());
	}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
