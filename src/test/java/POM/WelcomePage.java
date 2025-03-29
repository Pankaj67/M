package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	//delaration 
	@FindBy(linkText = "Register")
private	WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(id = "FirstName")
    private	WebElement firstnameTextfield;
	
	@FindBy(id = "LastName")
private	WebElement lastname;
	
	@FindBy(id = "Email")
private	WebElement Email;


	@FindBy(id = "Password")
private	WebElement password;


	@FindBy(id = "ConfirmPassword")
private	WebElement repassword;


	@FindBy(id = "register-button")
private	WebElement loginbutton;

	
	
	


		public WelcomePage(WebDriver driver)
		{
		
			// this method will create web elements
			PageFactory.initElements(driver, this);
			}
		
		//getter 
	public WebElement getRegisterLink() {
			return registerLink;
		}
	
	public WebElement getLoginLink() {
		return loginLink;
	}
	
	public WebElement getFirstnameTextfield() {
		return firstnameTextfield;
	}
	public WebElement getLastname() {
		//String lastname = RandomStringUtils.randomAlphabetic(5);
		return lastname;
	}
		
		public WebElement getEmail() {
		return Email;
	}
		
		public WebElement getpassword() {
			return password;
		}
			

		public WebElement getrepassword() {
			return repassword;
		}
			
		public WebElement getloginbutton() {
			return loginbutton;
		}
			

		
	}

	


