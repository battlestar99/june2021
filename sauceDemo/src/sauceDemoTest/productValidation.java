package sauceDemoTest;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class productValidation {
	
	
	
	
	
	
	@BeforeTest
	public void setupTest() {}
	
	
	@AfterTest
	public void endTest() {}
	
	@Test
	public void productValidation() {
		Reporter.log("this is product validation test");
	System.out.println("This is product validation test");	
		
	}

}
