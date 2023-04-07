package labWorkover_loading_rridding;

class Vehicle {
     String brand;
     String model;
     int year;

     Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

     void drive() {
        System.out.println("Driving the vehicle.");
    }
}

class Car extends Vehicle {
     String color;

    Car(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.color = color;
    }

    public void honk() {
        System.out.println("Honking the car's horn.");
    }
}

public class Vehicle_LabWork {
    public static void main(String[] args) {
        Car myCar = new Car("Ford", "Mustang", 1969, "Gray");
        
        myCar.drive();
        myCar.honk();
    }
}
