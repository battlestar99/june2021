package selenium;

public class fireFoxDriver implements WebDriver {

	@Override
	public void findElement() {
		
		System.out.println("findelement in firefoxdriver");
		
	}

	@Override
	public void sendKeys() {
		System.out.println("sendkeys in firefoxdriver");
		
	}

	@Override
	public void click() {
		System.out.println("click in firefoxdriver");
		
	}

}
