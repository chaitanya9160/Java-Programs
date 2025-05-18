import java.util.Scanner;

class MenuSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an option (1-10):");
        int option = input.nextInt();

        switch (option) {
            case 1: System.out.println("New File"); break;
            case 2: System.out.println("Open File"); break;
            case 3: System.out.println("Save File"); break;
            case 4: System.out.println("Print"); break;
            case 5: System.out.println("Copy"); break;
            case 6: System.out.println("Paste"); break;
            case 7: System.out.println("Cut"); break;
            case 8: System.out.println("Find"); break;
            case 9: System.out.println("Replace"); break;
            case 10: System.out.println("Exit"); break;
            default: System.out.println("Invalid choice");
        }
    }
}
