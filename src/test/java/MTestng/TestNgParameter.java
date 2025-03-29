package MTestng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameter {
	

	
	@Test
	@Parameters({"pankaj"})
	public void test1(@Optional String name)
	{
		System.out.println( " i am inside 1 "+Thread.currentThread().getId());
		System.out.println("name is"+ name);
//	WebDriver driver = new ChromeDriver();
//	        driver.manage().window().maximize();
//	        driver.get("https://jqueryui.com/datepicker/");
//	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	

}
