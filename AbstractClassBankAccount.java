package JavaPractice;

abstract class BankAcc {
    protected String accountNumber;
    protected double balance;

    public BankAcc(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Concrete method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAcc {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Override displayAccountInfo method to include interest rate
    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAcc {
    private double overdraftFee;

    public CheckingAccount(String accountNumber, double balance, double overdraftFee) {
        super(accountNumber, balance);
        this.overdraftFee = overdraftFee;
    }

    // Override displayAccountInfo method to include overdraft fee
    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Overdraft Fee: $" + overdraftFee);
    }
}

public class AbstractClassBankAccount {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA123456", 1000, 3.5);
        CheckingAccount checkingAccount = new CheckingAccount("CA987654", 500, 25);

        System.out.println("Savings Account Details:");
        savingsAccount.displayAccountInfo();

        System.out.println("\nChecking Account Details:");
        checkingAccount.displayAccountInfo();
    }
}
