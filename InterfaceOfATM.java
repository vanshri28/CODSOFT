import java.util.Scanner;

	class BankAccount {
	    private double balance;

	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public boolean withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            return true;
	        }
	        return false;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }
	}
	
	class ATM {
	    private BankAccount account;

	    public ATM(BankAccount account) {
	        this.account = account;
	    }

	    public void start() {
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n ATM MENU...");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    checkBalance();
	                    break;
	                case 2:
	                    System.out.print("Enter amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    deposit(depositAmount);
	                    break;
	                case 3:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    withdraw(withdrawAmount);
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }

	        } while (choice != 4);

	        scanner.close();
	    }

	    public void checkBalance() {
	        System.out.println("Your current balance is: Rs" + account.getBalance());
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            account.deposit(amount);
	            System.out.println("Rs" + amount + " deposited successfully.");
	            checkBalance();
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (account.withdraw(amount)) {
	            System.out.println("Rs" + amount + " withdrawn successfully.");
	            checkBalance();
	        } else {
	            System.out.println("Withdrawal failed. Check your balance or amount entered.");
	        }
	    }
	}

	public class InterfaceOfATM{
	    public static void main(String[] args) {
	        BankAccount userAccount = new BankAccount(1000.0);
	        ATM atm = new ATM(userAccount);
	        atm.start();
	    }
	}
