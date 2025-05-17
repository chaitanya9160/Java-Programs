import java.util.Scanner;

class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        double bill = 50; // Fixed charge

        if (units <= 100) {
            bill += units * 1.5;
        } else if (units <= 200) {
            bill += 100 * 1.5 + (units - 100) * 2;
        } else {
            bill += 100 * 1.5 + 100 * 2 + (units - 200) * 3;
        }

        System.out.println("Total Bill: ₹" + bill);

        sc.close();
    }
}
