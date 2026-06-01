package practiceJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.publix.com/");
	   WebElement Catering = driver.findElement(By.xpath("//span[text()='Catering']"));
	   WebElement giftcards = driver.findElement(By.xpath("//span[text()='Gift Cards']"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(Catering).click().perform();
	  //actions.moveToElement(giftcards).click().perform();
	   driver.navigate().to("https://www.google.com/");
	   WebElement SearchBox = driver.findElement(By.xpath("//textarea[@title='Search']"));
	   SearchBox.sendKeys("Georgetown");
	   SearchBox.sendKeys(Keys.ARROW_DOWN);
	   SearchBox.sendKeys(Keys.ENTER);
	   //actions.moveByOffset(100,50);
	   driver.quit();
	   
	   
	   
	   
	    
	    
		
		

	}

}
