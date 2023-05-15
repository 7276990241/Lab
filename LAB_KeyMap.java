package collections;


//Write a Java program to get the value of a specified key in a map taking input from the user 
//and printing value present along with the object and not found if not present.

import java.util.*;

public class LAB_KeyMap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//creating HashMap
		Map<String, Object> map=new HashMap<>();
		
		//the map with key value 
		map.put("name", "Priyanka");
		map.put("Roll no", 190);
		map.put("Age", 23);
		map.put("City", "Solapur");
		
		//input key from user
		System.out.println("Enter the key to get value: ");
		String key= sc.next();
		
		//check the key is present 
		if(map.containsKey(key))
		{
			//get the value of specific key
			Object value =map.get(key);
			//print the object and its value '
			System.out.println("Object: " + value.getClass().getSimpleName() + " Value: " + value);
     } else {
         // key not found
         System.out.println("Key not found!");
     }
	}		
}
