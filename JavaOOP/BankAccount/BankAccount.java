import java.util.*;
public class BankAccount {
	private String accountNumber;
	private double checkingBalance = 0.00;
	private double savingsBalance = 0.00;
	public static int numAccounts = 0;
	public static double totalDeposits = 0;
	
	// CONSTRUCTORS
	public BankAccount() {
		this.accountNumber = this.createAccountNumber();
		BankAccount.numAccounts++;
	}
	public BankAccount(double checkingBalance) {
		this.accountNumber = this.createAccountNumber();
		BankAccount.numAccounts++;
		this.checkingBalance = checkingBalance;
		this.totalDeposits += checkingBalance;
	}
	public BankAccount(double checkingBalance, double savingsBalance) {
		this.accountNumber = this.createAccountNumber();
		BankAccount.numAccounts++;
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		
		this.totalDeposits += checkingBalance;
		this.totalDeposits += savingsBalance;
	}
	
	
	
	//CLASS METHODS
	
	
	// INSTANCE METHODS
	private String createAccountNumber(){
		String accountNumber = "";
		int stringSize = 10;
		int number;
		Random random = new Random();
		ArrayList<Integer> randomNumberArr = new ArrayList<Integer>();
		for(int i=0; i<stringSize; i++){
			number = random.nextInt(9 - 0 + 1);
			accountNumber += number;
		}
		return accountNumber;
	}
	
	public void depositMoney(double deposit, String accountType) {
		if(accountType.equals("checking")) {
			this.checkingBalance += deposit;
			BankAccount.totalDeposits += deposit;
		}
		if(accountType == "savings") {
			this.savingsBalance += deposit;
			BankAccount.totalDeposits += deposit;
		}
		if(accountType != "checking" && accountType != "savings") {
			System.out.println("You must select checking or savings account to proceed.");
		}
	}
	
	public double withdrawMoney(double withdraw, String accountType) {
		if(accountType.equals("checking")) {
			if(withdraw <= this.checkingBalance) {
				this.checkingBalance -= withdraw;
				BankAccount.totalDeposits -= withdraw;
			} else {
				System.out.println("You do not have sufficient funds in your Checking Account to make that withdrawal.");
				return 0;
			}
		}
		if(accountType == "savings") {
			if(withdraw <= this.savingsBalance) {
				this.savingsBalance -= withdraw;
				BankAccount.totalDeposits -= withdraw;
			} else {
				System.out.println("You do not have sufficient funds in your Savings Account to make that withdrawal.");
				return 0;
			}
		}
		if(accountType != "checking" && accountType != "savings") {
			System.out.println("You must select checking or savings account to proceed.");
			return 0.00;
		}
		return withdraw;
	}

	
	//GETTERS AND SETTERS
	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public static int getNumAccounts() {
		return numAccounts;
	}

	public static double getTotalDeposits() {
		return totalDeposits;
	}
}
