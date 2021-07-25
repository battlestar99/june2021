package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productPage {
	
	WebDriver driver; 
	
	public productPage(WebDriver driver) {
		
		this.driver=driver; 
		
	}
	
	
	public WebElement getBackpackCart() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		
		return x; 
	}
	
public WebElement getlightCart() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
		
		return x; 
	}
	

	

}
