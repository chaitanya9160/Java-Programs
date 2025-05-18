import java.util.Scanner;

class FruitSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number (1-10): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1: System.out.println("Apple"); break;
            case 2: System.out.println("Banana"); break;
            case 3: System.out.println("Orange"); break;
            case 4: System.out.println("Mango"); break;
            case 5: System.out.println("Grapes"); break;
            case 6: System.out.println("Pineapple"); break;
            case 7: System.out.println("Guava"); break;
            case 8: System.out.println("Papaya"); break;
            case 9: System.out.println("Watermelon"); break;
            case 10: System.out.println("Strawberry"); break;
            default: System.out.println("Invalid choice");
        }
    }
}
