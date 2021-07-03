package pages;

public class car {
	
	int milleage; 
	
	
	public car(int milleage) {
		
	this.milleage=milleage;
		
	}
	
	public car() {
		
		System.out.println("no input car object");	
		
	}
	
	public car (String y) {
		
		System.out.println("constructor with string input");	
		
	}
	
	
	public void go() {
		
		System.out.println("go");
	}

}
