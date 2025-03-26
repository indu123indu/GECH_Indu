package Assignment_In_Java;

public class BankAccount {
	
	// BankAccount.java
	
	    // Private fields (Encapsulation)
	    private String accountNumber;
	    private String accountHolderName;
	    private double balance;

	    // Constructor
	    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.accountHolderName = accountHolderName;
	        this.balance = Math.max(initialBalance, 0); // Ensuring non-negative balance
	    }

	    // Method to deposit money
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: $" + amount);
	        } else {
	            System.out.println("Invalid deposit amount!");
	        }
	    }

	    // Method to withdraw money
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: $" + amount);
	        } else {
	            System.out.println("Insufficient balance or invalid amount!");
	        }
	    }

	    // Method to display account details
	    public void displayAccountInfo() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Balance: $" + balance);
	    }

	    // Getter for balance (Encapsulation)
	    public double getBalance() {
	        return balance;
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        // Creating a new Bank Account
	        BankAccount account = new BankAccount("123456789", "John Doe", 1000.0);

	        // Display initial details
	        account.displayAccountInfo();

	        // Deposit and withdraw operations
	        account.deposit(500);
	        account.withdraw(300);
	        account.withdraw(1500); // This should fail due to insufficient balance

	        // Display final account details
	        account.displayAccountInfo();
	    }
	}



