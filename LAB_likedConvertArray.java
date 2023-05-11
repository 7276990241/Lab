
//Write a Java program to convert a linked list to an array list.

package collections;

import java.util.LinkedList;
import java.util.ArrayList;

public class LAB_likedConvertArray {
	public static void main(String[] args) {
		
		// Create a linked list
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Ajay");
        linkedList.add("Aishwarya");
        linkedList.add("Susmit");

        // Convert linked to array
        ArrayList<String> arrayList = new ArrayList<String>(linkedList);

        // Print the array list
        System.out.println("Array List: " + arrayList);
		
	}

}

