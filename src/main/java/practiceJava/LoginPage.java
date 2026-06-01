package practiceJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Page Layer Contains Locators and reusable Methods
public class LoginPage {
	
	WebDriver driver;
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locators
	private By user = By.id("user-name");
	private By pass = By.id("password");
	private By login = By.id("login-button");
	
	//Actions	
	public void enterUname(String uname) {
		driver.findElement(user).sendKeys("uname");
	}
	
	public void enterPword(String pword) {
		driver.findElement(pass).sendKeys("pword");
	}
	
	public void clickLogin() {
		driver.findElement(login).click();
	}
	
	public  void login(String uname, String pword) {
		enterUname(uname);
		enterPword(pword);
		clickLogin();	
	}
	
}

