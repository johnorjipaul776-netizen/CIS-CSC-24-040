package Lab6;

public class BankAccount {

    private String accountName;
    private double balance;

    // Constructor
    public BankAccount(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }

    // Display account details
    public void displayAccount() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Balance: " + balance);
    }
    
}
