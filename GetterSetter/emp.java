class Employee {
    private String id;
    private String name;
    private double salary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class emp{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId("E101");
        e.setName("Ravi");
        e.setSalary(55000);
        System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary());
    }
}
