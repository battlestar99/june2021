package webAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webBasic {

	public static void main(String[] args) throws InterruptedException  {
		
	
		
		// setup the location for chromedriver 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse_ws_june\\libraries\\chromedriver.exe");
		
		// creating an object of the Webdriver class
		
		// opening up the browser
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.get("https://www.twitter.com");
		
		// every driver is associated with a browser instance
		WebDriver driver1=new ChromeDriver();
		Thread.sleep(2000);
		
		driver1.get("https://www.amazon.com");
		WebDriver driver2= new ChromeDriver();
		Thread.sleep(2000);
		driver2.get("https://www.facebook.com");
		
		
		driver.close();
		
		driver1.close();
		
		driver2.close();
		
		
		
		
		
		
		
		

	}

}
