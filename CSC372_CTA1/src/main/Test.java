package main;

public class Test {
	
	
	public static void printSpacer() {
	    System.out.println("\n-------------------------------------\n");
	}
	
	public static void main(String[] args) {
		
		System.out.println("===========[TESTING BANK ACCOUNT]===========");
	
		//A spacer line.
		printSpacer();
		
		//Creating my new cool bank account.
		final String firstName = "Alex";
		final String lastName = "Carpenter";
		final int bankAccNumber = 42069;
		BankAccount bankAcc = new BankAccount(firstName, lastName, bankAccNumber);
		
		//Making a million dollar deposit, followed by a 999,999.00 withdrawal.
		final double testBankDeposit = 1000000.34;
		final double testBankWithdrawal = 999999.00;
		
		bankAcc.deposit(testBankDeposit);
		bankAcc.withdraw(testBankWithdrawal);
		
		//Printing bank info to see that I do have $1 left. :(
		bankAcc.printAccountInfo();
		
		//A spacer line.
		printSpacer();
		
		System.out.println("===========[TESTING CHECKING ACCOUNT]===========");

		//A spacer line.
		System.out.println();
		
		//Creating a new checking account for myself.
		final int checkingAccountID = 1337;
		final double checkingAccountInterestRate = 1.3;
		CheckingAccount checkAcc = new CheckingAccount(firstName, lastName, checkingAccountID, checkingAccountInterestRate);
		
		//Making a 100.25 deposit into my checking account, followed by a 150 withdrawal.
		//The larger withdrawal is to test the overdraft functionality.
		final double testCheckingDeposit = 100.25;
		final double testCheckingWithdrawal = 150;
		checkAcc.deposit(testCheckingDeposit);
		checkAcc.withdrawFromChecking(testCheckingWithdrawal);
		
		//A spacer line, as the overdraft warning should appear.
		printSpacer();
		
		//Displaying my final checking account details.
		checkAcc.displayAccount();
	}

}
