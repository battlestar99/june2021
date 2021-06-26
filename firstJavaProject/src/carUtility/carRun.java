package carUtility;

public class carRun {

	public static void main(String[] args) {
	
		carAction ca; 
		
		ca=new carAction();
		
		carAction ba=new carAction();
		
		
		int x = ca.getCarMileage();
		
		ca.start();
		
		String vin = ca.getCarVin();
		
		
		ca.troubleShoot("altima", 129);
		
		ca.troubleShoot("honda",100);
		

	}

}
