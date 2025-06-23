package abstraction;

abstract class Employee {
    abstract void calculateSalary();
}

class FullTime extends Employee {
    void calculateSalary() {
        System.out.println("Full-time salary = base + bonus");
    }
}

class PartTime extends Employee {
    void calculateSalary() {
        System.out.println("Part-time salary = hours * rate");
    }
}

public class Emp {
    public static void main(String[] args) {
        FullTime ftEmployee = new FullTime();
        PartTime ptEmployee = new PartTime();

        ftEmployee.calculateSalary();   
        ptEmployee.calculateSalary();   
    }
}
