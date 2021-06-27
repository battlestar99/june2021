package yahooPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signUpYahooVersionTwo {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse_ws_june\\libraries\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://login.yahoo.com/account/create");
		
		Thread.sleep(2000);
		
		
		WebElement firstName = driver.findElement(By.id("usernamereg-firstName"));
		WebElement lastName  = driver.findElement(By.id("usernamereg-lastName"));
		WebElement username = driver.findElement(By.name("yid"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement continuebutton = driver.findElement(By.id("reg-submit-button"));
		
		boolean x = firstName.isDisplayed();
		
		boolean y = lastName.isEnabled();
		
		firstName.sendKeys("john");
		
		Thread.sleep(1000);
		
		firstName.clear();
		
		String z = continuebutton.getText();
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(z);

	}

}
