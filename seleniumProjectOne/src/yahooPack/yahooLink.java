package yahooPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooLink {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse_ws_june\\libraries\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://login.yahoo.com/account/create");
		
		Thread.sleep(2000);
		
		
		WebElement signInLink = driver.findElement(By.linkText("Sign In"));
		
		signInLink.click();

	}

}
