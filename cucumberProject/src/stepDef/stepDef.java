package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.cartPage;
import pages.loginPage;
import pages.productPage;

public class stepDef {
	
	
	WebDriver driver;
	loginPage lp; 
	productPage pp; 
	cartPage cp; 
	
	
	
	@Before
	public void beforeFeature() {
	
		System.out.println("This is before feature");
		
	}
	
	@After
	public void afterFeature() {
		
		System.out.println("This is after feature");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse_ws_june\\libraries\\chromedriver.exe");	
		driver = new ChromeDriver();
		lp=new loginPage(driver);
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Thread.sleep(2000);
	}

	@When("^user enters valid username$")
	public void user_enters_valid_username() throws Throwable {
	    
		WebElement loginbox = driver.findElement(By.id("user-name"));
		loginbox.sendKeys("standard_user");
	}

	@When("^user enters valid password$")
	public void user_enters_valid_password() throws Throwable {
	    
		WebElement passwordbox = driver.findElement(By.id("password"));
		passwordbox.sendKeys("secret_sauce");
		
		
		
	}

	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
	    
		
		lp.getloginButton().click();
	}

	@Then("^user should be on the account page$")
	public void user_should_be_on_the_account_page() throws Throwable {
	    
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		Assert.assertEquals("test1", "test1");
	
	
	}

	@When("^user enters invalid username$")
	public void user_enters_invalid_username() throws Throwable {
	   
		
		lp.getUsername().sendKeys("locked_out_user");
	}

	@When("^user enters invalid password$")
	public void user_enters_invalid_password() throws Throwable {
	    
		
		lp.getPassword().sendKeys("secret_sauce");
	}

	

	@Then("^user should not be able to login$")
	public void user_should_not_be_able_to_login() throws Throwable {
	   
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}

	@Then("^user should close the browser$")
	public void user_should_close_the_browser() throws Throwable {
	   driver.quit();
	}
	
	
	@Then("^d$")
	public void d() throws Throwable {
	    
	System.out.println("This is d");	
		
		
	}
	
	@Given("^a$")
	public void a() {
	    
		System.out.println("This is a");
	}

	@When("^b$")
	public void b() throws Throwable {
		System.out.println("This is b");
	}

	@Then("^c$")
	public void c() throws Throwable {
		System.out.println("This is c");
	}


	
	@When("^user enters expired username$")
	public void user_enters_expired_username() throws Throwable {
	    
		WebElement passwordbox = driver.findElement(By.id("password"));
		passwordbox.sendKeys("anik");
		
		
		
	}
	
	@When("^user enters expired password$")
	public void user_enters_expired_password() throws Throwable {
	    
		WebElement passwordbox = driver.findElement(By.id("password"));
		passwordbox.sendKeys("secret_sauce123");
		
		
		
	}
	
	
	
	@When("^user enters valid username as <\"([^\"]*)\">$")
	public void user_enters_valid_username_as(String username) throws Throwable {
	    
		lp.getUsername().sendKeys(username);
	}

	@When("^user enters valid password as <\"([^\"]*)\">$")
	public void user_enters_valid_password_as(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		lp.getPassword().sendKeys(password);
	}

	// ----------------------------------
	
	
	@Given("^user is on product page$")
	public void user_is_on_product_page() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse_ws_june\\libraries\\chromedriver.exe");	
		driver = new ChromeDriver();
		lp=new loginPage(driver);
		pp = new productPage(driver);
		cp = new cartPage(driver);
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Thread.sleep(2000);
	    
	    WebElement loginbox = driver.findElement(By.id("user-name"));
		loginbox.sendKeys("standard_user");
		
		WebElement passwordbox = driver.findElement(By.id("password"));
		passwordbox.sendKeys("secret_sauce");
		
		lp.getloginButton().click();
	}
		
		
	

	@When("^user adds backpack in the cart$")
	public void user_adds_backpack_in_the_cart() throws Throwable {
	  
		pp.getBackpackCart().click();
		
	}

	@When("^user adds bike ligt in the cart$")
	public void user_adds_bike_ligt_in_the_cart() throws Throwable {
	    
		pp.getlightCart().click();
	}

	@Then("^checkout menu should be available with products$")
	public void checkout_menu_should_be_available_with_products() throws Throwable {
	  
		cp.getcheckOutMenu().click();
	}

	@Then("^user should be able to click on checkout$")
	public void user_should_be_able_to_click_on_checkout() throws Throwable {
	    
		cp.getcheckOutButton().click();
	}



@When("^user enters username \"([^\"]*)\"$")
public void user_enters_username(String username) throws Throwable {
    
	lp.getUsername().sendKeys(username);
}

@When("^user enters password \"([^\"]*)\"$")
public void user_enters_password(String password) throws Throwable {
    
	lp.getPassword().sendKeys(password);
}


	
	
	
	
	

}
