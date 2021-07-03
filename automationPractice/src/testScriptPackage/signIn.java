package testScriptPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signIn {

	public static void main(String[] args) {
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse_ws_june\\libraries\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement signIn =  driver.findElement(By.linkText("Sign in"));
		
		
		signIn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement useremail = driver.findElement(By.id("email_create"));
		WebElement createButton = driver.findElement(By.id("SubmitCreate"));
	
		
		
		
		useremail.sendKeys("dfhldsaf@df.com");
		createButton.click();
		
		
	}

}
