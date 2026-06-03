package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import practiceJava.BaseTest;
import practiceJava.LoginPage;

@Test
public class LoginTest extends BaseTest {

	@Test(priority=1,retryAnalyzer = RetryAnalyzer.class)
	public void verifySuccessfulLogin() {

		// Create object of Login Page
		LoginPage lp = new LoginPage(driver);

		// Perform Login
		lp.login("standard_user", "secret_sauce");

		// Validate URL
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.saucedemo.com/";
		Assert.assertEquals(actualURL, expectedURL, "URL Displayed is not Correct");
		System.out.println(actualURL);

		// Validate Title
		String actualTitle = driver.getTitle();
		String expectedTitle = "Swag Labs";
		Assert.assertEquals(actualTitle, expectedTitle, "Title Validation Failed");
		System.out.println(actualTitle);

	}

 // Adding comment to check git hub integration with Jenkins

//		String parentwindow = driver.getWindowHandle();
//		System.out.println(parentwindow);	
//		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
//		System.out.println(elements);
//		driver.close();

	}

	// @Test
//	public void verifyInvalidLogin() {
//		
//		LoginPage lp2 = new LoginPage(driver);
//		lp2.enterUsername("Paru");
//		lp2.enterPassword("Pass");
//		lp2.clickLogin();
//		
//		
//	}
