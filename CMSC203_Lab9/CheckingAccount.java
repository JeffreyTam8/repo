
/*
 * Jeffrey Tam
 * 12/6/20
 * CMSC 203 21599
 * Task #1
 * 
 */
/**
 * 
 * @author Jeffrey Tam
 * This manages the checking account class
 */
public class CheckingAccount extends BankAccount{
	
	private final double FEE = 0.15;	//Fee for withdrawing money from the account
	
	/**
	 * Constructor using the super class constructor 
	 * @param name
	 * @param amount
	 */
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		super.setAccountNumber(super.getAccountNumber().concat("-10"));
	}
	
	/**
	 * @Override withdraw method of the super class
	 * This confirms if the driver can withdraw money from the account from the amount the driver's asking
	 */
	public boolean withdraw(double amount) {
		
		double newAmount = amount + FEE;		//The amount being compared is the amount plus the fee
		return super.withdraw(newAmount);		//Uses super class method 
		
	}
}
