package bankAccount;

public class bankAccount {
	
	
	String accountNum;  
	
	String accountName; 
	
	int depositedMoney; 
	
	int totalMoney; 
	
	static int numberOfUsers; 
	
	
	public bankAccount(String accountName) {
		
		System.out.println("This is construtor with string input");
		this.accountName=accountName; 
		
	}
	
	public bankAccount(int x) {
		
		
		System.out.println("This is construtor with int input");	
		
	}
	
	public bankAccount() {
		
		System.out.println("This is construtor with no input");
	}
	
	
	
	
	public static void resetAccount() {
		
		int x; 
	}
	
	public void deposit() {
		
		System.out.println("deposit function in bankaccount");
		
	}
	
	
	
	public void withdraw() {
		
		
	}

	public void setDueDate() {
		
		
		
	}
	
}
