package abstraction;

abstract class Shape2 {
    public abstract double calculateArea();
}

class Circle extends Shape2 {
     double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle2 extends Shape2 {
     double width;
     double height;

    public Rectangle2(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class AbstractClassShape {
    public static void main(String[] args) {
        Circle c = new Circle(7.0);
        System.out.println("Circle area: " + c.calculateArea());

        Rectangle2 rectangle = new Rectangle2(3.0, 5.0);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}

