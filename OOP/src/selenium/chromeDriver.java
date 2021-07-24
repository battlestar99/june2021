package selenium;

public class chromeDriver implements WebDriver {

	@Override
	public void findElement() {
		
		System.out.println("findlement in chromedriver");
		
	}

	@Override
	public void sendKeys() {
		System.out.println("sendkeys in chromedriver");
		
	}

	@Override
	public void click() {
		System.out.println("click in chromedriver");
		
	}

}
