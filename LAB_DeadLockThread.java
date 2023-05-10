//WAP showing the deadlock problem and solve it using thread join method.

package thread;

public class LAB_DeadLockThread {

	    public static void main(String[] args) {
	        final Object resource1 = new Object();
	        final Object resource2 = new Object();

	        Thread thread1 = new Thread(() -> {
	            synchronized (resource1) {
	                System.out.println("Thread 1: Acquired resource 1");

	                try {
	                    Thread.sleep(1000); // Simulating some work
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }

	                synchronized (resource2) {
	                    System.out.println("Thread 1: Acquired resource 2");
	                }
	            }
	        });

	        Thread thread2 = new Thread(() -> {
	            synchronized (resource2) {
	                System.out.println("Thread 2: Acquired resource 2");

	                try {
	                    Thread.sleep(1000); // Simulating some work
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }

	                synchronized (resource1) {
	                    System.out.println("Thread 2: Acquired resource 1");
	                }
	            }
	        });

	        thread1.start();
	        thread2.start();

	        try {
	            thread1.join(); // Wait for thread1 to complete
	            thread2.join(); // Wait for thread2 to complete
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Program completed successfully.");
	   }
}
