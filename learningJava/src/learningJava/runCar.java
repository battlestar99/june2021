package learningJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.airplane;

public class runCar {

	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		car.getcarPrice();
		
		int x ; 
		
		System.out.println("test");
		
		car c = new car();
		
		c.start();
		
		airplane ap=new airplane();
		
		ap.fly();

	}

}
