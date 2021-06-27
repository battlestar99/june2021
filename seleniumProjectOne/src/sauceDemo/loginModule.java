package sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginModule {

	public static void main(String[] args) throws InterruptedException {
		
		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse_ws_june\\libraries\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login-button"));
		boolean x = username.isDisplayed();
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();

		
		System.out.println(x);
		
		

	}

}
