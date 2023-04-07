package labWorkover_loading_rridding;

class Person { //parent class
     String name;
     int age;

     Person(String name, int age) {
        this.name = name; //attribute
        this.age = age; //attribute
    }

     void speak() { //method 
        System.out.println("Hi!, My name is " + name + " and I am " + age + " years old.");
    }
}

 class Student extends Person { //child class
     int grade;

     Student(String name, int age, int grade) {
        super(name, age);//super method for accessing parent class
        this.grade = grade;
    }

     void study() { //method
        System.out.println("Studying for the exam.");
    }
}

public class Person_LabWork { //main class
    public static void main(String[] args) {
        Student myStudent = new Student("Ajay", 27, 12);

        myStudent.speak();
        myStudent.study();
    }
}
