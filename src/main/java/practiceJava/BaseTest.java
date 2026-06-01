package practiceJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

//Handles Browser setup and teardown
public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver(); 	//Launching Browser and assigning to driver
		driver.manage().window().maximize(); //Maximizing the Window
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com/");//Navigate to Website
		
	}
	
	@AfterTest
	public void tearDown() {
		if(driver!=null) {
			driver.quit(); //Close the Browser/Tabs/Session
		}
	}
	
}
