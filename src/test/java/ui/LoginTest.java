package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static String browser = "Chrome";
	public static WebDriver driver;


	public static void main(String[] args) {

		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
 
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		String CurrentUrl = driver.getCurrentUrl();
		String parentwindow = driver.getWindowHandle();
		System.out.println(Title);
		System.out.println(CurrentUrl);
		System.out.println(parentwindow);	
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(elements);
		//driver.navigate().to("https://viabenefits.com/");
		//driver.navigate().back();
		driver.close();

	}

}
