import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Choose a number (1-10) for its table: ");
        int num = input.nextInt();

        switch (num) {
            case 1: case 2: case 3: case 4: case 5:
            case 6: case 7: case 8: case 9: case 10:
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + " x " + i + " = " + (num * i));
                }
                break;
            default:
                System.out.println("Choose number between 1 and 10");
        }
    }
}
