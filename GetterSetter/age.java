class AgeHolder {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class age{
    public static void main(String[] args) {
        AgeHolder a = new AgeHolder();
        a.setAge(21);
        System.out.println("Age: " + a.getAge());
    }
}
