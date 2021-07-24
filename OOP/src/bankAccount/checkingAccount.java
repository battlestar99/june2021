package bankAccount;

public class checkingAccount extends bankAccount {
	
	
	String checkingAccountNum; 
	
	
	
	public void setupCheckingAccount() {
		
		
	}
	
	public void deposit() {
	
	super.deposit();	
	System.out.println("deposit in checkingaccount");
		
	}

}
