package testPack;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basicNG {
	
	@AfterTest
	public void endTest() {
		
		System.out.println("This is after test");	
		
	}
	
	@BeforeMethod
	public void beforeEachTest() {
	
		System.out.println("This is before method");	
		
	}
	
	
	@Test(priority=1)
	public void loginTest() {
		
		
		
		Assert.assertEquals("test1", "test");
		System.out.println("This is the main test");	
		
	}
	
	@Test(priority=2)
	public void SignUpTest() {
		
		Assert.assertEquals("test", "test");
		System.out.println("This is the main test one");
		
	}
	
	@BeforeTest
	public void setupTest() {
	
	System.out.println("This is beforetest");	
		
	}
	
	@AfterMethod
	public void afterEachTest() {
		
		System.out.println("This is after method");	;	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
