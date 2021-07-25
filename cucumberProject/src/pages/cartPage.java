package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartPage {
	
	WebDriver driver;
	public cartPage(WebDriver driver) {
		
		this.driver=driver; 
	}
	
	public WebElement getcheckOutMenu() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		
		return x; 
	}

	public WebElement getcheckOutButton() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
		
		return x; 
	}

}
