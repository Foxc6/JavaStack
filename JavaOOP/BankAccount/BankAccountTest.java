
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(100.00, 600.50);
		BankAccount b2 = new BankAccount(100.00);
		BankAccount b3 = new BankAccount();
		System.out.println(BankAccount.getNumAccounts());
		System.out.println("BankAccountOne: Account# " + b1.getAccountNumber() + ", Checking Balance: $" + b1.getCheckingBalance() + ", Savings Balance: $" + b1.getSavingsBalance());
		System.out.println("BankAccountTwo: Account# " + b2.getAccountNumber() + ", Checking Balance: $" + b2.getCheckingBalance() + ", Savings Balance: $" + b2.getSavingsBalance());
		System.out.println("BankAccountThree: Account# " + b3.getAccountNumber() + ", Checking Balance: $" + b3.getCheckingBalance() + ", Savings Balance: $" + b3.getSavingsBalance());

		System.out.println("Total Deposits in Bank: " + BankAccount.getTotalDeposits());
			
		b3.depositMoney(145.00, "checking");
		b3.depositMoney(1200.00, "savings");
		System.out.println("CHECKING: " + b3.getCheckingBalance());
		System.out.println("SAVINGS: " + b3.getSavingsBalance());
		
		System.out.println("Total Deposits in Bank: " + BankAccount.getTotalDeposits());
		
		b3.withdrawMoney(1300.00, "checking");
		System.out.println("CHECKING: " + b3.getCheckingBalance());
		System.out.println("SAVINGS: " + b3.getSavingsBalance());
		
		System.out.println("Total Deposits in Bank: " + BankAccount.getTotalDeposits());
		
		
		b3.withdrawMoney(20.00, "checking");
		b3.withdrawMoney(1000.00, "savings");
		System.out.println("CHECKING: " + b3.getCheckingBalance());
		System.out.println("SAVINGS: " + b3.getSavingsBalance());
		
		System.out.println("Total Deposits in Bank: " + BankAccount.getTotalDeposits());
		
		
	}
}
