package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pagehomeSauceDemo {
	
	WebDriver driver; 
	
	public pagehomeSauceDemo(WebDriver driver) {
		
		this.driver=driver; 
		
	}
	

	// 10 web elements, so we need 10 functions 
	
	
	public WebElement getUsername() {
		
		WebElement username = driver.findElement(By.id("user-name"));	
		return username ;
	}
	
	
	public WebElement getPassword() {
		
		WebElement password = driver.findElement(By.id("password"));
		return password; 
	}
	
	public WebElement getLoginButton() {
		
		WebElement login = driver.findElement(By.id("login-button"));
		return login; 
	}

}
