package carDealershipSoft;

import java.util.Scanner;

public class carPaymentV2 {

	public static void main(String[] args) {
		
		
		double carBasePrice; 
		double dealerFee; 
		double downPayment; 
		double taxPercent; 
		double totalTax; 
		double totalCarPrice; 
	//	double extraWarrenty; 
	//	double fiveYearserviceFee; 
		double monthlyPayment;
		double financeAmount; 
		int numberOfMonths;
		int creditScore=0; 
		double apr = 0; // annual percentage rate or interest rate
		double finalFinanceAmount; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base price of the car");
		carBasePrice = sc.nextDouble();
		dealerFee = 200; 
		System.out.println("Enter the down payment");
		downPayment = sc.nextDouble(); 
		taxPercent = 4; 
		System.out.println("Enter your credit score");
		creditScore = sc.nextInt();
		
		System.out.println("Number of months for financing");
		numberOfMonths=sc.nextInt();
		
		totalTax = ((carBasePrice+dealerFee)*4/100);
		
		System.out.println("Total tax for the sale is....");
		System.out.println(totalTax);
		
		totalCarPrice = carBasePrice+dealerFee+totalTax;
		System.out.println("Total car price..");
		System.out.println(totalCarPrice);
		
		financeAmount = totalCarPrice - downPayment; 
		
		System.out.println("financing price is..");
		System.out.println(financeAmount);
		
		if(creditScore>750) {
			
			apr = 1; 
		}
		
		if(creditScore<750 && creditScore>=700 ) {
			
			apr = 2; 
		}
		
      if(creditScore<700 && creditScore>=650 ) {
			
			apr = 3; 
		}
		
      if(creditScore<650 && creditScore>=600 ) {
			
			apr = 4; 
		}
      
      
      finalFinanceAmount =  financeAmount + (financeAmount*apr/100);
      
      System.out.println("final financing amount is..");
		System.out.println(finalFinanceAmount);
		
		
		monthlyPayment = finalFinanceAmount/numberOfMonths;
		
		
		System.out.println("your monthly payment is..");
		System.out.println(monthlyPayment);
		
		

	}

}
