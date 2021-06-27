package yahooPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signUpYahoo {

	public static void main(String[] args) throws InterruptedException {
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse_ws_june\\libraries\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://login.yahoo.com/account/create");
		
		Thread.sleep(2000);
		
		// finding first name text box and type the first name
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Jon");
		
		Thread.sleep(1000);
		
		// finding last name text box and type the last name
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Denver");
		Thread.sleep(1000);
		
		// finding user name text box and type the user name
		driver.findElement(By.name("yid")).sendKeys("D1223432");
		Thread.sleep(1000);
		
		// finding password text box and type the password
		driver.findElement(By.name("password")).sendKeys("dsafj");
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
