package testScriptPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class createAccount {

	public static void main(String[] args) throws InterruptedException {
	
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse_ws_june\\libraries\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		
		WebElement searchBox = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]"));
		WebElement searchButton = driver.findElement(By.name("submit_search"));
           
		
		
		searchBox.sendKeys("dresses");
		searchButton.click();

	}

}
