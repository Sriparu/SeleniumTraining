package practiceJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	protected WebDriver driver;
	
	
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.publix.com/");		
	}
	
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}

}

