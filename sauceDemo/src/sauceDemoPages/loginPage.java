package sauceDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	WebDriver driver; 
	
	public loginPage(WebDriver driver) {
		
		this.driver=driver; 
		
	}

	
	public WebElement getUserName() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		return username; 
		
	}
	
	
     public WebElement getPassword() {
		
    	 WebElement password = driver.findElement(By.id("password"));
		
    	 return password;
	}

      public WebElement getloginButton() {
	
    	  WebElement login = driver.findElement(By.id("login-button"));
    	  return login; 
	
}
	
	
	
}
