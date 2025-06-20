class Student {
    private String name;
    private int rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

public class stud{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Amit");
        s.setRollNo(101);
        System.out.println("Name: " + s.getName() + ", Roll No: " + s.getRollNo());
    }
}
