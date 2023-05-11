//Write a Java program to join two linked lists.

package collections;

import java.util.LinkedList;

public class LAB_JoinLinkedLists {
	public static void main(String[] args) {
		//create a linked list
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("Ajay");
		list1.add("Aishwarya");
		list1.add("LinkedList<String>");
		
		LinkedList<String> list2=new LinkedList<String>();
		list2.add("Kshirsagar");
		list2.add("Patil");
		list2.add("zunje");
		
		//joining the list 
		list1.addAll(list2);
		
		 // Print, joined list
        System.out.println("Joined Linked List: " + list1);
		
	}	
}