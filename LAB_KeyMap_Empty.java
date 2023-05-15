package collections;

//Write a Java program to check whether a map contains key-value mappings (empty) or not. 
//If not empty then remove all the elements and check again.

import java.util.*;

public class LAB_KeyMap_Empty {
	public static void main(String[] args) {
		//create a hash map
		Map<String, String> map=new HashMap<>();
		
		//the map with some key value
		map.put("Name", "PK");
     map.put("Location", "India");
     map.put("Profession", "Student");
     //map.put("mob no", 120);
     
  // check if the map is empty
     if (map.isEmpty()) {
         System.out.println("Map is empty!");
     } else {
         System.out.println("Map is not empty!");
         // remove all elements from the map
         map.clear();
         // check if the map is empty again
         if (map.isEmpty()) {
             System.out.println("All elements have been removed. Map is empty now!");
         } else {
             System.out.println("Map still has elements!");
         }
     }
	}
}
