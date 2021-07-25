package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	WebDriver driver; 
	
	public loginPage(WebDriver driver) {
		
		this.driver=driver; 
		
	}
	
	
	public WebElement getUsername() {
		
		WebElement loginbox = driver.findElement(By.id("user-name"));
		return loginbox; 
	}
	
public WebElement getPassword() {
		
	WebElement passwordbox = driver.findElement(By.id("password"));
	return passwordbox; 
	}


public WebElement getloginButton() {
	
	WebElement loginButton = driver.findElement(By.id("login-button"));
	return loginButton; 
	}
}
