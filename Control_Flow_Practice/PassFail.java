import java.util.Scanner;

class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter marks for Subject 1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int s3 = sc.nextInt();

        int failCount = 0;

       
        if (s1 < 35) failCount++;
        if (s2 < 35) failCount++;
        if (s3 < 35) failCount++;

        double average = (s1 + s2 + s3) / 3.0;

        if (failCount == 0) {
            if (average >= 50) {
                System.out.println("Result: Passed with average " + average);
            } else {
                System.out.println("Result: Failed due to low average (" + average + ")");
            }
        } else if (failCount == 1) {
            System.out.println("Result: Compartment (failed in one subject)");
        } else {
            System.out.println("Result: Failed (failed in " + failCount + " subjects)");
        }

        sc.close();
    }
}
