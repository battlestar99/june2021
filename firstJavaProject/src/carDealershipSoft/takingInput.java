package carDealershipSoft;

import java.util.Scanner;

public class takingInput {

	public static void main(String[] args) {
		
		
		int x; 
		int y; 
		
		Scanner abc = new Scanner(System.in);
		System.out.println("Enter the first number");
		x = abc.nextInt() ;
		System.out.println("Enter the second number");
		y = abc.nextInt(); 
		
		double z = abc.nextDouble();
		
		
		
		int sum = x+y; 
		
		System.out.println("The summation of the two value is");
		System.out.println(sum);

	}

}
