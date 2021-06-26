package webAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumBasic {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse_ws_june\\libraries\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.yahoo.com/");
		
		driver.navigate().to("https://www.yahoo.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("COVID-19")).click();
		
        String covidUrl = driver.getCurrentUrl();
        
        System.out.println(covidUrl);
        
        String covidTitle = driver.getTitle();
        
        System.out.println(covidTitle);
        
        Thread.sleep(2000);
        // going back to the page
        
        driver.navigate().back();
        
        Thread.sleep(2000);
        
        driver.navigate().forward();
        
        Thread.sleep(2000);
        
        driver.navigate().refresh();
        
        Thread.sleep(2000);
        
        //driver.close();
        
        driver.quit();
	}

}
