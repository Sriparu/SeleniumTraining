package practiceJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest2 {
	  public static String browser = "Chrome";
	  public static WebDriver driver;
	 
	  @BeforeMethod
		public void setup() {
	  
		if (browser.equals("Firefox")) {
			//WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.saucedemo.com/");
		}

		else if (browser.equals("Chrome")) {
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
		}
		
		else if (browser.equals("edge")) {
			//WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://www.saucedemo.com/");
		}
	  }

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

