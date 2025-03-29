package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WelcomePageScript {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fiv=new FileInputStream("./testData/WelcomePage.properties");
		Properties prop=new Properties();
		prop.load(fiv);	
		
		FileInputStream temp=new FileInputStream("./testData/Book1.xlsx");
		Workbook web = WorkbookFactory.create(temp);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("url"));
		WelcomePage wle=new WelcomePage(driver);
		
		wle.getRegisterLink().click();
		wle.getFirstnameTextfield().sendKeys(web.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue());
	    wle.getLastname().sendKeys(web.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue());
	    wle.getEmail().sendKeys(web.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue());
		wle.getpassword().sendKeys(prop.getProperty("password"));
	wle.getrepassword().sendKeys(prop.getProperty("password"));
	wle.getloginbutton().click();
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		driver.close();
		
		
		
//		ele.getRegisterLink().click();
//		ele.getMaleRadioButton().click();
//		ele.getFirstnameTextfield().sendKeys(web.getSheet("Register").getRow(1).getCell(0).getStringCellValue());
//		ele.getLastnameTextfield().sendKeys(web.getSheet("Register").getRow(1).getCell(1).getStringCellValue());
//		ele.getEmailTextfield().sendKeys(web.getSheet("Register").getRow(1).getCell(2).getStringCellValue());
//		ele.getPasswordTextfield().sendKeys(web.getSheet("Register").getRow(1).getCell(3).getStringCellValue());
//		ele.getConfirmPasswordTextfield().sendKeys(web.getSheet("Register").getRow(1).getCell(3).getStringCellValue());
//		ele.getRegisterButton().click();
		
		
		
	}

}
