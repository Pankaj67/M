package TestNG_annotationconfiguration;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationConfiguration {
	
	
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("@BeforeSuite",true);
			
	}
	
	// here we write code for obj creation 
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("@Beforetest",true);
			
	}
	
	@BeforeMethod
	public void DemoBeforeMethod()
	{
		Reporter.log("@DemoBeforetDemo excuted",true);
			
	}
		
	
	@Test
	public void Demo()
	{
		Reporter.log("@TestDemo excuted",true);
			
	}
		
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("@afterMethod",true);
			
	}

		
	@AfterSuite
	public void AfterSuite()
	{
		Reporter.log("@AfterSuite",true);
			
	}

		
		
		
		
		
		
		
		
		
		
		
		

	}


