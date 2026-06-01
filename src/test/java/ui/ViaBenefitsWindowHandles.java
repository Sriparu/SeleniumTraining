package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class ViaBenefitsWindowHandles {

	WebDriver driver;
    
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://viabenefits.com/");
	}
    
	@Test
	public void testWindowHandles() {
		driver.findElement(By.xpath("//div/a[text()='Solutions for Employers and Plan Sponsors']")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		Iterator iterator = windowhandles.iterator();
		String pwindow = (String) iterator.next();
		String cwindow = (String) iterator.next();	
		driver.switchTo().window(cwindow);
		driver.findElement(By.xpath("//div/a[contains(text(),'About')][1]")).click();
		String ctitle = driver.getTitle();
		System.out.println(ctitle);
		driver.switchTo().window(pwindow);
		String ptitle = driver.getTitle();
		System.out.println(ptitle);	
	}
	
	@Test
	public void testwindowhandles() {
		driver.findElement(By.xpath("//div/a[text()='Solutions for Employers and Plan Sponsors']")).click();
		Set<String> whandles = driver.getWindowHandles();
		Iterator iterator = whandles.iterator();
		String pwin = (String) iterator.next();
		String cwin = (String) iterator.next();
		driver.switchTo().window(cwin);
	}
    
	//@AfterMethod
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	
}
