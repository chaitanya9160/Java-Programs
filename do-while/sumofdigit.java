class sumofdigit{
    public static void main(String[] args) {
        int num = 4567, sum = 0;
        do {
            sum += num % 10;
            num /= 10;
        } while (num != 0);
        System.out.println("Sum of digits: " + sum);
    }
}
