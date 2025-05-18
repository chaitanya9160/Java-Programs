import java.util.Scanner;

public class CarBrand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Choose a brand number (1-8): ");
        int brand = input.nextInt();

        switch (brand) {
            case 1: System.out.println("Toyota"); break;
            case 2: System.out.println("Honda"); break;
            case 3: System.out.println("Hyundai"); break;
            case 4: System.out.println("Tata"); break;
            case 5: System.out.println("Suzuki"); break;
            case 6: System.out.println("Ford"); break;
            case 7: System.out.println("BMW"); break;
            case 8: System.out.println("Mercedes"); break;
            default: System.out.println("Invalid brand number");
        }
    }
}
