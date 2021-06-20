package methodPackage;

import java.util.Scanner;

public class notRunMain {
	
	public int addtwoNumbers(int a, int b) {
		
		double z=12;
		int sum; 
		sum=a+b; 
		String name="something";
		
		return sum; 	
		
	}
	
	public void printMyName(String name) {
		
		System.out.println(name);
		
	}
	
	
	public int subtract(int a, int b) {
		
		int sub=a-b; 
		return sub; 
		
		
	}
	
	
	public int getSummation(int j) {
		
       int sum = 0;
		
		j = 20; 
		
		for(int x=1;x<j;x++) {
			
			sum=sum+x; 
			
		}
		
		return sum; 
		
		
		
		
		
	}
	
	
	
	public void celtoFar() {
		
		// how this function can be efficient to be usuable
		// more 
		double celsius = 12; 
		double farenhite; 
		
	
		
		System.out.println("Enter the celsius value");
	
		farenhite= ((celsius*9)/5)+32; 
		
		System.out.println(farenhite);
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
