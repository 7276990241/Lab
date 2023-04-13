package abstraction;

interface BankAccount2 {
    void deposit(double amount);
    void withdraw(double amount);
}

class CheckingAccount2 implements BankAccount2 {
    private double balance;

    public CheckingAccount2(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("The Deposited " + amount + ".The New balance is " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("The Insufficient funds. The Current balance is " + balance);
        } else {
            balance -= amount;
            System.out.println("The Withdrawn " + amount + ".The New balance is " + balance);
        }
    }
}

//public interface LabWork_BankAccountEg2 {

public class BankAccountEg2 {
    public static void main(String[] args) {
        CheckingAccount2 acc = new CheckingAccount2(1000.0);
        acc.deposit(1500.0);
        acc.withdraw(1200.0);
    }
}
