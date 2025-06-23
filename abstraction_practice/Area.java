package abstraction;

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        System.out.println("Area = π * r * r");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area = length * width");
    }
}

public class Area {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.area();      
        rectangle.area();    
    }
}
