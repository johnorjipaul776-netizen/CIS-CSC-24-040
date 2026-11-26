package Lab6;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("John", 5000);

        System.out.println("Initial Account:");
        account.displayAccount();

        System.out.println("\nAfter Deposit:");
        account.deposit(2000);
        account.displayAccount();

        System.out.println("\nAfter Withdrawal:");
        account.withdraw(1500);
        account.displayAccount();

        System.out.println("\nAttempting Overdraft:");
        account.withdraw(10000);
        account.displayAccount();
    }
}
