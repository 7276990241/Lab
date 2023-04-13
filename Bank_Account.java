package abstraction;

abstract class BankAccount {
    private int accountNumber;
    protected double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        double currentBalance = getBalance();
        double newBalance = currentBalance + amount;
        super.balance = newBalance;
        System.out.println(" Rs:" + amount + " deposited. \n New balance: " + newBalance);
    }

    @Override
    public void withdraw(double amount) {
        double currentBalance = getBalance();
        if (currentBalance < amount) {
            System.out.println("Insufficient funds. Withdrawal not possible.");
        } else {
            double newBalance = currentBalance - amount;
            super.balance = newBalance;
            System.out.println("\n Rs:" + amount + " withdrawn.\n New balance: " + newBalance);
        }
    }
}

public class Bank_Account {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(112233, 10000);
        account.deposit(5500);
        account.withdraw(2200);
    }
}
