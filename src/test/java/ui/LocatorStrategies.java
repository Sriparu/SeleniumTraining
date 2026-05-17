package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorStrategies {

	public static String browser = "Chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
		} else if (browser.equals("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.get("https://www.singaporeair.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement acceptBtn = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Accept')]")));
		acceptBtn.click();
		driver.findElement(By.xpath("//span[@class='icon icon--close-circle']")).click();
		WebElement Origin = driver.findElement(By.id("flightOrigin1"));
		Origin.sendKeys("blr");
		Origin.sendKeys(Keys.ARROW_DOWN);
		Origin.sendKeys(Keys.ENTER);
		WebElement Destination = driver.findElement(By.id("bookFlightDestination"));
		Destination.sendKeys("dub");
		Destination.sendKeys(Keys.ARROW_DOWN);
		Destination.sendKeys(Keys.ENTER);
		// driver.switchTo().alert().dismiss();
		// WebElement radio1 = driver.findElement(By.id("bookFlights"));
		// radio1.click();
		// System.out.println(radio1.isSelected());
		//driver.close();

	}

}
