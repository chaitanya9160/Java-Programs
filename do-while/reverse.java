class reverse {
    public static void main(String[] args) {
        int num = 1234, rev = 0;
        do {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        } while (num != 0);
        System.out.println("Reversed: " + rev);
    }
}
