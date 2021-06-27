package yahooPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signUpYahooVersonOne {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse_ws_june\\libraries\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://login.yahoo.com/account/create");
		
		Thread.sleep(2000);
		
		
		WebElement firstName = driver.findElement(By.id("usernamereg-firstName"));
		WebElement lastName  = driver.findElement(By.id("usernamereg-lastName"));
		WebElement username = driver.findElement(By.name("yid"));
		WebElement password = driver.findElement(By.name("password"));
		
		Thread.sleep(1000);
		firstName.sendKeys("Jon");
		lastName.sendKeys("denver");
		username.sendKeys("gdfhj73737");
		password.sendKeys("dfdfjak");
		Thread.sleep(1000);
		
		driver.close();

	}

}
