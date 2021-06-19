package carDealershipSoft;

public class carPaymentV1 {

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
		
		carBasePrice = 40000;
		dealerFee = 200; 
		downPayment = 10000; 
		taxPercent = 4; 
		creditScore = 770;
		numberOfMonths=72;
		
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
