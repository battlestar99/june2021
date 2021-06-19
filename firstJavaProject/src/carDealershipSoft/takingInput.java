package carDealershipSoft;

import java.util.Scanner;

public class takingInput {

	public static void main(String[] args) {
		
		
		int x; 
		int y; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		x = sc.nextInt(); 
		System.out.println("Enter the second number");
		y = sc.nextInt(); 
		
		int sum = x+y; 
		
		System.out.println("The summation of the two value is");
		System.out.println(sum);

	}

}
