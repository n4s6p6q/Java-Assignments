package JavaPractice;

import java.util.Random;

public class BankAccount {

	String accountNumber;
    double balance;
    String ownerName;

    // Constructor
    public BankAccount() {
        // Initialize accountNumber with a random value
        generateAccountNumber();
        this.balance = 0;
        this.ownerName = "";
    }

    // Private method to generate a random account number
    private void generateAccountNumber() {
        Random rand = new Random();
        int num = rand.nextInt(1000000);
        this.accountNumber = String.format("%06d", num);
    }

    // Public method to open an account
    public void openAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    // Public method to display account details
    public void getAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Balance: $" + balance);
    }

    // Main method to demonstrate BankAccount class
    public static void main(String[] args) {
        // Create BankAccount objects
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        // Open accounts and display information
        account1.openAccount("Nikhil C", 1000);
        account2.openAccount("Nik C", 2000);

        System.out.println("Account 1 Information:");
        account1.getAccountInfo();
        System.out.println();

        System.out.println("Account 2 Information:");
        account2.getAccountInfo();
    }
}
