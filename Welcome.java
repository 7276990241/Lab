package thread;

class Test3 extends Thread
{
	public void run() 
	{
		
			System.out.println("Good morning");

	}
}
class Test4 extends Thread
{
	public void run() 
	{	
			System.out.println("Welcome");
			try
			{
				Thread.sleep(200); // 200 milliseconds
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		
	}
}
public class Welcome{ //main class
	
	public static void main(String[] args) { //main method
		// creating threads
		Test3 t1 = new Test3();
		Test4 t2 = new Test4();
	
		t1.start();//runnable state
		t2.start();
	
	}
}
