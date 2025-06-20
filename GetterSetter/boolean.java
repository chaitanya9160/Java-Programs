class Light {
    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}

public class bool{
    public static void main(String[] args) {
        Light l = new Light();
        l.setOn(true);
        System.out.println("Is light on? " + l.isOn());
    }
}
