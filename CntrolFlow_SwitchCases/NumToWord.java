import java.util.Scanner;

class NumberToWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number (0-9): ");
        int num = input.nextInt();

        switch (num) {
            case 0: System.out.println("Zero"); break;
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            case 3: System.out.println("Three"); break;
            case 4: System.out.println("Four"); break;
            case 5: System.out.println("Five"); break;
            case 6: System.out.println("Six"); break;
            case 7: System.out.println("Seven"); break;
            case 8: System.out.println("Eight"); break;
            case 9: System.out.println("Nine"); break;
            default: System.out.println("Invalid input");
        }
    }
}
