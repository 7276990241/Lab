package assignment11;

public class SmallestThree {
	public static void main(String[] args)
	{
		int a = 20;
		int b = 30;
		int c = 10;
		int smallest;
		if(a<b && a<c)
		{
			smallest = a;
		}
		else if(b<c)
		{
			smallest = b;
	}
	else
	{
		smallest = c;
	}
System.out.println(smallest +"is the smallest.");
}
}
