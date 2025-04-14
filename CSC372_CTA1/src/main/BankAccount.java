package main;

public class BankAccount {
	
	//Variables/Components of a bank account.
	private String firstName;
	String lastName;
	int accountID;
	double balance;
	
	//The constructor of the bank account.
	public BankAccount(String firstNameToBe, String lastNameToBe, int IDToBe) {
		this.firstName = firstNameToBe;
		this.lastName = lastNameToBe;
		this.accountID = IDToBe;
		this.balance = 0;
	}
	
	//Deposit function that adds to the current balance.
	public void deposit(double toDeposit) { 
		if (toDeposit < 0) {
		    System.out.println("Error: Deposit must be a positive number!");
		    return;
		} else {
			this.balance += toDeposit;
		}
	}
	
	//Withdraw function that subtracts from the current balance.
	public void withdraw(double toWithdraw) {
		if (toWithdraw > balance) {
		    System.out.println("Error: Insufficient funds!");
		} else {
			this.balance -= toWithdraw;
		}
	}
	
	//Setters.
	public void setFirstName(String firstNameToBe) { this.firstName = firstNameToBe; }
	public void setLastName(String lastNameToBe) { this.lastName = lastNameToBe; }
	public void setAccountID(int IDToBe) { this.accountID = IDToBe; }
	
	//Getters.
	public String getFirstName() { return this.firstName; }
	public String getLastName() { return this.lastName; }
	public int getAccountID() { return this.accountID; }
	public double getBalance() { return this.balance; }
	
	//A function that prints all the account information.
	public void printAccountInfo() {
		System.out.println("Bank Account of: "+this.firstName+" "+this.lastName);
		System.out.println("Account ID: " + this.accountID);
		System.out.println("Current Balance: " + this.balance);
	}
}
