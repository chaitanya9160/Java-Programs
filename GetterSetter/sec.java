class Car {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

public class sec{
    public static void main(String[] args) {
        Car c = new Car();
        c.setBrand("Toyota");
        System.out.println("Car Brand: " + c.getBrand());
    }
}
