package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {
	
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(browser.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		}
		else if(browser.equals("edge"))
			
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	
	   //13 different methods of WebDriver Interface	
		driver.get("https://www.saucedemo.com/");
		driver.navigate().to("https://viabenefits.com/");
		driver.navigate().back();
		driver.manage().window().maximize();
		String CurrentURL = driver.getCurrentUrl();
		String Title = driver.getTitle();
		String PageSource = driver.getPageSource();
		System.out.println(CurrentURL);
		System.out.println(Title);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();	
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(elements);
		//driver.switchTo();
		//driver.close();
		//driver.quit();
		driver.navigate().to("https://viabenefits.com/");
		//ParentWindow
		String ParentWindow = driver.getWindowHandle();
		System.out.println(ParentWindow);
		//click open new tab
		driver.findElement(By.xpath("/html/body/header/div[2]/a")).click();
		//Get All Handles
		Set<String> AllHandles = driver.getWindowHandles();
		System.out.println(AllHandles);
		//Switch to child Window
		for(String window : AllHandles) {
			if(!window.equals(ParentWindow)) {
				driver.switchTo().window(window);
				System.out.println(driver.getTitle());
				driver.quit(); //closes child window
			}
		}

	}

}
