package testScriptPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.pagehomeSauceDemo;

public class sauceDemothree {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse_ws_june\\libraries\\chromedriver.exe");	
			
		WebDriver driver = new ChromeDriver();
		pagehomeSauceDemo ph = new  pagehomeSauceDemo(driver);
		
		ph.getUsername().sendKeys("test");
		ph.getPassword().sendKeys("dfas");
        ph.getLoginButton().click();
	}

}
