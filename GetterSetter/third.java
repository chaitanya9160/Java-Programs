class Laptop {
    private String model;

    public String getModel() {
        return model;
    }

    public Laptop setModel(String model) {
        this.model = model;
        return this;
    }
}

public class third{
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.setModel("Dell XPS 15");
        System.out.println("Laptop Model: " + l.getModel());
    }
}
