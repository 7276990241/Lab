package assignment11;

public class Car 
{
	String make;
	String model;
	int year;
	public void start()
	{
		System.out.println("Starting the" +year+" " +make +" " +model);
	}
}

 class Main
{
	public static void main(String[] args)
	{
		Car myCar = new Car();
		myCar.make = "Toyota";
		myCar.model = "Camry";
		myCar.year = 2022;
		myCar.start();
		
	}
}
