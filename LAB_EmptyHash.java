package collections;


//Write a Java program to empty an hash set.
import java.util.HashSet;

public class LAB_EmptyHash {
	public static void main(String[] args) {
		
	//creating a hash set
		HashSet<String> hs = new HashSet<String>();
		
		//adding the to hash set
		hs.add("Python");
		hs.add("Java");
		hs.add("HTMl");
		
		 System.out.println("Hash Set before clearing:"+hs);

	        // Clearing the HashSet
	        hs.clear();

	        System.out.println("Hash Set after clearing:"+hs);	

	}	
}
