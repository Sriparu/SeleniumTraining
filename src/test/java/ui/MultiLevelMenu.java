package ui;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiLevelMenu {
	public static String browser = "Chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		Map<String, Object> prefs = new HashMap<>();
		// 0 = Default, 1 = Allow, 2 = Block
		prefs.put("profile.default_content_setting_values.geolocation", 2);
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		FirefoxProfile profile = new FirefoxProfile();
		// 0 = Default, 1 = Allow, 2 = Block
		profile.setPreference("permissions.default.geo", 2);

		FirefoxOptions options1 = new FirefoxOptions();
		options1.setProfile(profile);

		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
		} else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(options1);
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		WebElement ddown = driver.findElement(By.className("product_sort_container"));
		Select select = new Select(ddown);
		// select.selectByIndex(3);
		select.selectByValue("lohi");
		// select.selectByVisibleText("Name (Z to A)");
		driver.navigate().to("https://www.publix.com/");
		String CurrentUrl = driver.getCurrentUrl();
		String CurrentTitle = driver.getTitle();
		System.out.println(CurrentUrl);
		System.out.println(CurrentTitle);
	
		List<WebElement> Alltags = driver.findElements(By.xpath("//nav[@aria-label='sections']/ul/li"));
		System.out.println("TotalTags" + Alltags.size());
		for(int i=0;i<Alltags.size();i++) {
			//System.out.println("All Tags Values"+ Alltags.get(i).getAttribute("aria-label"));
			System.out.println("Tag Name --- "+ Alltags.get(i).getText());
		}
		driver.findElement(By.xpath("//li[@title='BOGOs']")).click();
		driver.findElement(By.xpath("//button[@title='Savings']")).click();
		driver.findElement(By.xpath("//div[@class='flyout-menu']/ul/li[@class='flyout-menu-item-wrapper']/a/span[contains(text(),'Weekly')]")).click();
		String CurrentTitle1 = driver.getTitle();
		System.out.println(CurrentTitle1);
		/*WebElement Arrow = driver.findElement((By.xpath("//span[@class='p-icon p-icon-null caretDown']")));
		Arrow.click();
		Arrow.sendKeys(Keys.ARROW_DOWN);
		Arrow.sendKeys(Keys.ENTER);*/
		
		/*WebElement search = driver.findElement(By.name("searchTerm"));
		search.sendKeys("Subs");
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ENTER);
		// driver.switchTo().alert().accept();*/

		// WebElement search =
		// driver.findElement(By.xpath("//input[@placeholder='Search']"));
		/*
		 * search.sendKeys("paper towels"); search.sendKeys(Keys.ARROW_DOWN);
		 * search.sendKeys(Keys.ENTER); WebDriverWait wait = new
		 * WebDriverWait(driver,Duration.ofSeconds(10)); Actions actions = new
		 * Actions(driver); WebElement babyMenu =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//div[@data-testid='PopoverMobile'][1]")));
		 * actions.moveToElement(babyMenu).perform();
		 */
		// driver.close();
	}

}
