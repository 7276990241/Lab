package collections;


//Write a Java program to convert a hash set to a tree set.
import java.util.HashSet;
import java.util.TreeSet;

public class LAB_HashSetToTree {
	public static void main(String[] args) {
		
		//create a hash set
		HashSet<Integer> hs=new HashSet<>();
		hs.add(5);
		hs.add(3);
		hs.add(1);
		hs.add(6);
		hs.add(2);
		hs.add(4);
		
		//convert hashset to tree
		TreeSet<Integer> ts=new TreeSet<>(hs);
		
		//print the tree set
		System.out.println("The ThreeSet:"+ts);
	}

}