package sauceDemoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import sauceDemoPages.loginPage;

public class sauceDemoLogin {
	
	WebDriver driver; 
	loginPage lp; 
	
	
	@BeforeTest
	public void setupTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse_ws_june\\libraries\\chromedriver.exe");	
		driver = new ChromeDriver();
	    lp= new loginPage(driver);
	   
	    
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void endTest() {
		
		driver.quit();
		
	}
	
	@Parameters({"username","password","experctedresult"})
	@Test
	public void dataloginValidation(String username, String password, String experctedresult) throws InterruptedException {
	
		lp.getUserName().sendKeys(username);
		lp.getPassword().sendKeys(password);
		
		Thread.sleep(3000);
		
		lp.getloginButton().click();
		
		
		String actualResult=driver.getCurrentUrl();
		
		
		Assert.assertEquals(actualResult, experctedresult );
		
		Thread.sleep(1000);
	
		
	}
	

}
