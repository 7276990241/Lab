
//Create deposit and display balance methods in the program for inter-thread communication

package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LAB_DepositDisplay {
    private double balance;
    private Lock lock;

    public LAB_DepositDisplay() {
        balance = 0;
        lock = new ReentrantLock();
    }

    public void deposit(double amount) {
        lock.lock(); // Acquire the lock to ensure exclusive access
        try {
            balance += amount;
        } finally {
            lock.unlock(); // Release the lock after updating the balance
        }
    }

    public double getBalance() {
        lock.lock(); // Acquire the lock to ensure consistent reading of the balance
        try {
            return balance;
        } finally {
            lock.unlock(); // Release the lock after reading the balance
        }
    }

    public static void main(String[] args) {
    	LAB_DepositDisplay account = new LAB_DepositDisplay();

        // Create two threads to deposit and display the balance concurrently
        Thread depositThread = new Thread(() -> {
            account.deposit(1500);
            System.out.println("Deposit complete");
        });

        Thread displayThread = new Thread(() -> {
            double balance = account.getBalance();
            System.out.println("Current balance: " + balance);
        });

        // Start the threads
        depositThread.start();
        displayThread.start();

        // Wait for both threads to complete
        try {
            depositThread.join();
            displayThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
