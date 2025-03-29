package MPARALLEL;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
	
	
	
	@Test
	public void test1()
	{
		System.out.println( " i am inside 1 "+Thread.currentThread().getId());
		
//	WebDriver driver = new ChromeDriver();
//	        driver.manage().window().maximize();
//	        driver.get("https://jqueryui.com/datepicker/");
//	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@Test
	public void test2()
	{
		System.out.println(" i am inside 2 "+Thread.currentThread().getId());
		
//		   WebDriver driver = new ChromeDriver();
//	        driver.manage().window().maximize();
//	        driver.get("https://www.google.com/");
//	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}


	@Test
	public void test3()
	{
		System.out.println(" i am inside 3 "+Thread.currentThread().getId());
		
//		   WebDriver driver = new ChromeDriver();
//	        driver.manage().window().maximize();
//	        driver.get("https://www.google.com/");
//	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test
	public void test4()
	{
		System.out.println(" i am inside 4 "+Thread.currentThread().getId());
		
//		   WebDriver driver = new ChromeDriver();
//	        driver.manage().window().maximize();
//	        driver.get("https://www.google.com/");
//	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

}
