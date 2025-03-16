package main;

public class BankAccount {
	
	//Variables/Components of a bank account.
	String firstName;
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
	public void Deposit(double toDeposit) { this.balance += toDeposit; }
	
	//Withdraw function that subtracts from the current balance.
	public void Withdraw(double toWithdraw) {
		this.balance -= toWithdraw;
	}
	
	//Setters.
	public void SetFirstName(String firstNameToBe) { this.firstName = firstNameToBe; }
	public void SetLastName(String lastNameToBe) { this.lastName = lastNameToBe; }
	public void SetAccountID(int IDToBe) { this.accountID = IDToBe; }
	
	//Getters.
	public String GetFirstName() { return this.firstName; }
	public String GetLastName() { return this.lastName; }
	public int GetAccountID() { return this.accountID; }
	public double GetBalance() { return this.balance; }
	
	//A function that prints all the account information.
	public void PrintAccountInfo() {
		System.out.println("Bank Account of: "+this.firstName+" "+this.lastName);
		System.out.println("Account ID: " + this.accountID);
		System.out.println("Current Balance: " + this.balance);
	}
}
