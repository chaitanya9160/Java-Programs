class count_digit {
    public static void main(String[] args) {
        int number = 123456;
        int count = 0;

        while (number != 0) {
            count++;
            number /= 10;
        }

        System.out.println("Digits: " + count);
    }
}
