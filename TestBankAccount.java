package assignment27;


abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void deposit(double amount) {
        double currentBalance = getBalance();
        currentBalance += amount;
        setBalance(currentBalance);
    }

    public void withdraw(double amount) {
        double currentBalance = getBalance();
        currentBalance -= amount;
        setBalance(currentBalance);
    }

    private void setBalance(double balance) {
        // do any necessary validations here
        this.balance = balance;
    }
}

public class TestBankAccount {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount("1234567890", 1000.0);
        System.out.println("Initial balance: " + account.getBalance());

        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}
