package collections;


//Create a new class Student(id,name,roll) where the values are going to get stored in an arraylist and 
//compared according to the roll no and print the sorted list.

import java.util.*;

public class Student implements Comparable<Student> {
	
	private int id;
	private String name;
	private int roll;
	
	public Student(int id, String name, int roll) 
	{
		this.id=id;
		this.name=name;
		this.roll=roll;
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public static void main(String[] args) {
	
		// creating the list of students
      List<Student> students = new ArrayList<>();
      
      // add some students to the list
      students.add(new Student(1, "Pruthviraj", 2));
      students.add(new Student(2, "Nayan", 4));
      students.add(new Student(3, "Prem", 5));
      students.add(new Student(4, "Aishwarya", 1));
      students.add(new Student(5, "Priyanka", 3));
      
      // sort the list according to roll number
      Collections.sort(students);
      
      // print the sorted list
      for (Student student : students) 
      {
          System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Roll: " + student.getRoll());
      }
	}

	@Override
	public int compareTo(Student o) {
		
		return 0;
	}
}
