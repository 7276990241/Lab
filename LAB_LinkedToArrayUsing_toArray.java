
package collections;

import java.util.LinkedList;
import java.util.ArrayList;

public class LAB_LinkedToArrayUsing_toArray {
	public static void main(String[] args) {

		// Create a linked list
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Ajay");
        linkedList.add("Aishwarya");
        linkedList.add("Susmit");
        
        // Convert linked list to array using "toArray"
        String[] array = linkedList.toArray(new String[0]);
        
        // Print the array
        for (String element : array) {
            System.out.println(element);
        }	
	}	
}

