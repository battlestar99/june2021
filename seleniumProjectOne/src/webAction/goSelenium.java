package webAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class goSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse_ws_june\\libraries\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yahoo.com/");
		
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.close();
	}

}
