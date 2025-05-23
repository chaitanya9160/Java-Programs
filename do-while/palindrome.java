class palindrome{
    public static void main(String[] args) {
        int original = 121, num = original, rev = 0;
        do {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        } while (num != 0);
        System.out.println(original == rev ? "Palindrome" : "Not Palindrome");
    }
}
