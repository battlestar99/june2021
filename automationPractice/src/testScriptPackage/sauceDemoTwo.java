package testScriptPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.pagehomeSauceDemo;

public class sauceDemoTwo {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse_ws_june\\libraries\\chromedriver.exe");	
			
			WebDriver driver = new ChromeDriver();
			pagehomeSauceDemo ph = new pagehomeSauceDemo(driver);
			
			driver.get("https://www.saucedemo.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//Thread.sleep(2000);
			
		//WebElement x = ph.getUsername();
		//x.sendKeys("standard_user");
			
		ph.getUsername().sendKeys("standard_user");
		ph.getPassword().sendKeys("secret_sauce");
		ph.getLoginButton().click();
			
	
			
	}

}
