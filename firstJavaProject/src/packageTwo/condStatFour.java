package packageTwo;

public class condStatFour {

	public static void main(String[] args) {
	
		
		int x = 12; 
		int y = 500; 
		int z = 500; 
		
		boolean conditionOne=(x>y && y==z);
		boolean conditiontwo=((x>y || y==z)&& x+y>z);
		
		if(conditionOne) {
			
			
			System.out.println("condition 1 is true");
			
		}
		
		if(conditiontwo) {
			
			System.out.println("condition 2 is true");
		}

	}

}
