package packageTwo;

import java.util.Scanner;

public class celsiusToFar {

	public static void main(String[] args) {
		
	// this is a comment 	
		
		// declaration of a variable
		
		double celsius; 
		double farenhite; 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the celsius value");
		celsius= sc.nextDouble(); 
		
		farenhite= ((celsius*9)/5)+32; 
		
		
		System.out.println("The farenhite value will be");
		System.out.println(farenhite);
		
		
		
		
		

	}
}

