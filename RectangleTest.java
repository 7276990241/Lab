package encapsulationTest;

public class RectangleTest {
	public static void main(String[] args)
	{
		   Rectangle rt = new Rectangle(27,30); 
		   int lth = rt.getLength(); 
		   int bth = rt.getBreadth(); 
		   int Area = lth * bth; 
		   System.out.println("Area: " +Area); 
		   rt.setLength(15); 
		   rt.setBreadth(60); 
		   int ln = rt.getLength(); 
		   int br = rt.getBreadth(); 
		   int newArea = ln * br; 
		   System.out.println("New area: " +newArea); 

	}

}
