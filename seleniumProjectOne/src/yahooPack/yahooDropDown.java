package yahooPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class yahooDropDown {

	public static void main(String[] args) throws InterruptedException {
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse_ws_june\\libraries\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://login.yahoo.com/account/create");
		
		Thread.sleep(2000);
		
		
		WebElement countryCode = driver.findElement(By.name("shortCountryCode"));
		
		Select countryDD=new Select(countryCode);
		
		//countryDD.selectByVisibleText("Afghanistan ‪(+93)‬");
		
		countryDD.selectByValue("AR");
		
		WebElement month = driver.findElement(By.id("usernamereg-month"));
		
		Select monthdd=new Select(month);
		
		monthdd.selectByVisibleText("May");
		
		Thread.sleep(2000);
		
		monthdd.selectByIndex(2);

	}

}
