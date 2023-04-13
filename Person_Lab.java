package abstraction;

interface Person {
	  public void speak();
	}

	class Student implements Person {
	  public void speak() {
	    System.out.println("I am a student.");
	  }
	}

	class Teacher implements Person {
	  public void speak() {
	    System.out.println("I am a teacher.");
	  }
	}

	//public interface LabWord_Person {
	public class Person_Lab {
	  public static void main(String[] args) {
	    Person student = new Student();
	    student.speak(); // "I am a student."
	    
	    Person teacher = new Teacher();
	    teacher.speak(); // "I am a teacher."
	  }
}

