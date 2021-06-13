package packageOne;

public class conditonalTwo {

	public static void main(String[] args) {
	
		int x = 300; 
		int y = 200; 
		
	// relationship between boolean value and if condition
	// bolean variable can be use as result of conditional operator	
		boolean flag = (x==y);
		boolean flagOne=(x>y);
		boolean flagTwo=(x<y);
		
		
		if(flag) {
			
			System.out.println("x is equal to y");
		}
		
		if(flagOne) {
			
			System.out.println("x is greater than y");
		}
		
		if(flagTwo) {
			
			System.out.println("x is less than y");
			
		}
		
		

	}

}
