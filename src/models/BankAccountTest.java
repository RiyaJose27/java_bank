package models;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Bank Account ");
		
		BankAccount account1 = new BankAccount(500.0, 750.0 );
		BankAccount account2 = new BankAccount(250.0, 100.5);
		
		System.out.println("Checking " + account1.getCheckingBalance());
		
		System.out.println("Savings " +  account1.getSavingsBalance());
		
		
        account1.moneyDeposit("checking", 250.0);
        account1.moneyDeposit("savings", 250.0);
        
       System.out.println("Checking " +  account1.getCheckingBalance());
		
		System.out.println("Savings " +  account1.getSavingsBalance());
		
//		System.out.println(BankAccount.getNumofAccounts());
		account1.moneyWithdraw("checking", 650.0);
		System.out.println("Checking " +  account1.getCheckingBalance());
		
		System.out.println("Total account balance:  " +  account1.getTotalAccountBalance());
		
		
		System.out.println("Total Bank Money : " + BankAccount.getTotalMoney());

	    System.out.println("Account Number : " + account1.getAccountNumber());
	}

}
