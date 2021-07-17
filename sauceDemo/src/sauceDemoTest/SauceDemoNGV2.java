package sauceDemoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import sauceDemoPages.loginPage;



public class SauceDemoNGV2 {
	
	
WebDriver driver; 
loginPage lp; 

	
	@BeforeTest
	public void setupTest() throws InterruptedException {
	
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse_ws_june\\libraries\\chromedriver.exe");	
		driver = new ChromeDriver();
		lp=new loginPage(driver);
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	// post-condition
	@AfterTest
	public void endTest() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}
	
	
	@BeforeMethod
	public void beforeEachTest() {
		

		driver.manage().deleteAllCookies();
		driver.navigate().refresh();	
		
	}
	
	
	@Test(priority=1)
	public void login_Element_Validation() {
		
		boolean x = lp.getUserName().isDisplayed();
		boolean y = lp.getPassword().isDisplayed(); 
		boolean z = lp.getloginButton().isDisplayed(); 
		
		Assert.assertEquals(x, true);
		Assert.assertTrue(y);
		Assert.assertTrue(z);
		
		
	}
	
	@Test(priority=3)
	public void positive_login_Validation() {
		
		
		
		lp.getUserName().sendKeys("standard_user");
		lp.getPassword().sendKeys("secret_sauce");
		lp.getloginButton().click();
		
		String expectedUrl= "https://www.saucedemo.com/inventory.html";
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl);
			
	}
	
	
	@Test(priority=2)
	public void naegative_login_Validation(){
		
		lp.getUserName().sendKeys("wrong_user");
		lp.getPassword().sendKeys("secret_sauce");
		lp.getloginButton().click();
		
		String expectedUrl= "https://www.saucedemo.com/";
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	

}
