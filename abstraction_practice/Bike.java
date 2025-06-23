package abstraction;

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key.");
    }
}

class Test extends Vehicle {
    void start() {
        System.out.println("Bike starts with kick.");
    }
}

class Bike {
    public static void main(String[] args) {
        Car car = new Car();
        Test test = new Test();

        car.start();
        test.start();
    }
}
