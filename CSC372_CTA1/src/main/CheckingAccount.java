package main;

//Checking account class that extends from super class 'BankAccount'.
public class CheckingAccount extends BankAccount {
	
	//Variables for the checking account.
	//overdraftFee is 'final' as it wont ever be changed via code.
	//... and 'magic numbers' are bad and annoying.
	double interest;
	final int overdraftFee = 30;
	
	//Constructor for the checking account that inherits from the superclass 'BankAccount'.
	public CheckingAccount(String firstNameToBe, String lastNameToBe, int IDToBe, double interestToBe) {
		super(firstNameToBe, lastNameToBe, IDToBe);
		this.interest = interestToBe;
	}
	
	//A function that withdraws from checking account.
	public void WithdrawFromChecking(double amountToWithdraw) {
		//Checks to see if the amount being withdrawn is greater than the current balance...
		if(amountToWithdraw > GetBalance()) {
			//...if it is, apply the overdraft fee.
			Withdraw(amountToWithdraw + overdraftFee);
			System.out.println("A $30 overdraft fee has been applied!");
		} else {
			//...if it is not, withdraw without an overdraft fee.
			Withdraw(amountToWithdraw);
		}
		System.out.println("Balance after withdrawal: $" + GetBalance());
	}
	
	//Display bank info with the addition of the checking accounts interest rate.
	public void DisplayAccount() {
		PrintAccountInfo();
		System.out.println("Interest Rate of Checking Account: " + interest + "%");
	}
	
}
