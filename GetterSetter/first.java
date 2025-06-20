class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class first{
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Chaitanya");
        System.out.println("Name: " + p.getName());
    }
}
