package models;

import java.util.Random;

public class BankAccount {
	//attributes - belongs to instance
	
	 private long accountNumber;
     private double checkingBalance;
     private double savingsBalance;

     
   //class member belongs to the class
     private static int numofAccounts;
     private static double totalMoney;
     
     
     public BankAccount() {
    	  
     }


	public BankAccount(double checkingBalance, double savingsBalance) {
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		this.accountNumber = accountGen();
		
		
		numofAccounts++;
		totalMoney += (checkingBalance + savingsBalance);
	}

	
	public void moneyDeposit(String account, double deposit) {
		if(account.equals("checking")) {
			this.setCheckingBalance(this.checkingBalance + deposit);
		
		}
		else {
			this.setSavingsBalance(this.getSavingsBalance() + deposit);
		}
		
		BankAccount.totalMoney += deposit;
	}

	
	
	
	public void moneyWithdraw(String account, double withdraw) {
		if(account.equals("checking")){
			if(this.checkingBalance < withdraw) {
				System.out.println("not enough");
			}
		
			
		else {
			this.setCheckingBalance(this.checkingBalance - withdraw);
			BankAccount.totalMoney = totalMoney - withdraw;
		}
		}
		
	}
	
	
	
	public double getTotalAccountBalance() {
		return this.checkingBalance + this.savingsBalance;
	}
	
	
	private long  accountGen() {
		Random rand = new Random();
		
		
		long  num = (long) (Math.random()*Math.pow(10, 10));
		System.out.println(num);
		return num;
		
		
	}
	
	
	public double getCheckingBalance() {
		return checkingBalance;
	}


	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}


	public double getSavingsBalance() {
		return savingsBalance;
	}


	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}


	public static int getNumofAccounts() {
		return numofAccounts;
	}


	public static void setNumofAccounts(int numofAccounts) {
		BankAccount.numofAccounts = numofAccounts;
	}


	public static double getTotalMoney() {
		return totalMoney;
	}


	public static void setTotalMoney(double totalMoney) {
		BankAccount.totalMoney = totalMoney;
	}


	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
     
	
	
     
     
}


