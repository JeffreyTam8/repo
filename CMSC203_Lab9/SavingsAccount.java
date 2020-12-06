/*
 * Jeffrey Tam
 * CMSC 203 21599
 * Task #2
 */
/**
 * 
 * @author Jeffrey Tam
 * This class operates the savings account class
 *
 */
public class SavingsAccount extends BankAccount{
	
	private double rate = 0.025;		//Rate of annual interest
	private int savingsNumber = 0;		//Number of saving accounts
	private String accountNumber;		//The account number
	
	/**
	 * Constructor of account
	 * @param name
	 * @param amount
	 */
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = super.getAccountNumber().concat( "-" + savingsNumber);	//Fills in the current savings account number
		savingsNumber++;	//Increases the number of savings account for every account made
	}
	
	/**
	 * Copy constructor
	 * @param oldAccount
	 * @param amount
	 */
	public SavingsAccount (SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		savingsNumber = oldAccount.savingsNumber;
		accountNumber = oldAccount.getAccountNumber().substring(0, 7) + savingsNumber;	//Removes the old account number and replaces it with a new one
		savingsNumber++;	//Increases the number of savings account for every account made
	}
	
	/**
	 * Calculates the monthly interest of the current balance
	 */
	public void postInterest() {
		
		double addedInterest = super.getBalance() * rate / 12;
		super.setBalance(addedInterest + super.getBalance());
		
	}
	
	/**
	 * Accessor, gets the account number of the savings account
	 */
	public String getAccountNumber() {
		
		return accountNumber;
		
	}
	
	

}
